package com.credan.data.inport;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.credan.data.inport.dao.DataChsiMapper;
import com.credan.data.inport.dao.DataMobileMapper;
import com.credan.data.inport.entity.DataChsi;
import com.credan.data.inport.entity.DataMobile;
import com.credan.data.inport.service.watch.WatchDir;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author Sam Wang
 * @Date 2017/2/21.
 * @Version 0.0.1
 */
@Component
public class ApplicationStartup implements ApplicationListener<ContextRefreshedEvent> {

    @Value("${watch.path}")
    private String dirPath;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DataChsiMapper chsiMapper;

    @Autowired
    private DataMobileMapper mobileMapper;


    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        logger.info("Application Startup");
        //防止事件触发两次
        if(null == event.getApplicationContext().getParent()) {

            WatchDir watchDir = null;
            try {
                watchDir = WatchDir.watchDirectory(dirPath, false);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (null != watchDir) {
                BlockingQueue<String> fileQueue = watchDir.processedFileQueue;
                int nThreads = Runtime.getRuntime().availableProcessors();
                ExecutorService executorService = Executors.newFixedThreadPool(nThreads);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (true) {
                            String file = null;
                            try {
                                file = fileQueue.take();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            logger.info("queue take file: {}", file);
                            executorService.submit(new ParseJSON(file));
                        }
                    }
                }).start();
                logger.info("dir is watchd,wait put json text");
            }
        }
    }

    class ParseJSON implements Callable<String>{
        private String path;
        public ParseJSON(String path){
            this.path = path;
        }

        @Override
        public String call()  {
            logger.info("handler json file {}",path);
            //String s = readFile(new File(path));
            //JavaType javaType = mapper.getTypeFactory().constructParametricType(ArrayList.class,Role.class);

            File jsonFile = new File(path);
            String type;
            String jsonStr = null;
            try {
                jsonStr =FileUtils.readFileToString(jsonFile,"UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }

            if(StringUtils.isEmpty(jsonStr.trim())){
                return null;
            }

            if(jsonFile.getName().endsWith("_学信网数据.txt")){
                type = "chsi";
                if(jsonIsEmpty(jsonStr,jsonFile,type)){
                    return null;
                }
                DataChsi dataChsi = JSON.parseObject(jsonStr,DataChsi.class);
                logger.info("fileName :{} ,parse json :{}",jsonFile.getName(),dataChsi);
                chsiMapper.insertSelective(dataChsi);
            }else if(jsonFile.getName().endsWith("_运营商数据.txt")){
                type = "mobile";
                if(jsonIsEmpty(jsonStr,jsonFile,type)){
                    return null;
                }
                String [] fnarr = jsonFile.getName().substring(0, jsonFile.getName().length()-4).split("_");
                String name = fnarr[1];
                String idCard = fnarr[0];

                JSONObject rootObject = JSON.parseObject(jsonStr);
                if(null != rootObject && !rootObject.isEmpty()) {
                    DataMobile dm = new DataMobile();
                    dm.setName(name);
                    dm.setIdCard(idCard);
                    dm.setId(rootObject.getString("_id"));
                    JSONObject report = rootObject.getJSONObject("report");
                    if(null != report && !report.isEmpty()) {
                        dm.setRptId(report.getString("rpt_id"));
                        dm.setToken(report.getString("token"));
                        dm.setUpdateTime(report.getString("update_time"));
                        dm.setVersion(report.getString("version"));
                    }
                    JSONObject user_info_check = rootObject.getJSONObject("user_info_check");
                    if(null != user_info_check && !user_info_check.isEmpty()) {
                        JSONObject check_black_info = user_info_check.getJSONObject("check_black_info");
                        if(null != check_black_info && !check_black_info.isEmpty()){
                            dm.setContactsClass1BlacklistCnt(check_black_info.getInteger("contacts_class1_blacklist_cnt"));
                            dm.setContactsRouterRatio(check_black_info.getString("contacts_router_ratio"));
                            dm.setContactsClass2BlacklistCnt(check_black_info.getInteger("contacts_class2_blacklist_cnt"));
                            dm.setContactsRouterCnt(check_black_info.getInteger("contacts_router_cnt"));
                            dm.setContactsClass1Cnt(check_black_info.getInteger("contacts_class1_cnt"));
                            dm.setPhoneGrayScore(check_black_info.getInteger("phone_gray_score"));
                        }
                        JSONObject check_search_info = user_info_check.getJSONObject("check_search_info");

                        if (null != check_search_info && !check_search_info.isEmpty()) {
                            dm.setSearchedOrgCnt(check_search_info.getInteger("searched_org_cnt"));
                            dm.setArisedOpenWeb(jsonArr2String(check_search_info.getString("arised_open_web")));
                            dm.setSearchedOrgType(jsonArr2String(check_search_info.getString("searched_org_type")));
                            dm.setRegisterOrgCnt(check_search_info.getInteger("searched_org_cnt"));
                            dm.setPhoneWithOtherIdcards(jsonArr2String(check_search_info.getString("phone_with_other_idcards")));
                            dm.setIdcardWithOtherPhones(jsonArr2String(check_search_info.getString("idcard_with_other_phones")));
                            dm.setIdcardWithOtherNames(jsonArr2String(check_search_info.getString("idcard_with_other_names")));
                            dm.setRegisterOrgType(jsonArr2String(check_search_info.getString("register_org_type")));
                            dm.setPhoneWithOtherNames(jsonArr2String(check_search_info.getString("phone_with_other_names")));
                        }
                    }
                    dm.setMainService(jsonArr2String(rootObject.getString("main_service")));
                    dm.setBehaviorCheck(jsonArr2String(rootObject.getString("behavior_check")));
                    dm.setCollectionContact(jsonArr2String(rootObject.getString("collection_contact")));
                    dm.setContactList(jsonArr2String(rootObject.getString("contact_list")));
                    dm.setEbusinessExpense(jsonArr2String(rootObject.getString("ebusiness_expense")));
                    dm.setContactRegion(jsonArr2String(rootObject.getString("contact_region")));
                    dm.setApplicationCheck(jsonArr2String(rootObject.getString("application_check")));
                    dm.setDeliverAddress(jsonArr2String(rootObject.getString("deliver_address")));
                    dm.setTripInfo(jsonArr2String(rootObject.getString("trip_info")));
                    mobileMapper.insertSelective(dm);
                }

            }else if(jsonFile.getName().endsWith("_风控报告.txt")){
                //type = "report";
                return null;
            }else {
                return null;
            }

            try {
                FileUtils.moveFile(jsonFile,new File(getDonePath(type)+File.separator+jsonFile.getName()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            return jsonFile.getName();
        }
    }

    private boolean jsonIsEmpty(String jsonStr,File jsonFile,String type){
        if(null == jsonArr2String(jsonStr)){
            logger.warn("jsonFile {} is empty",jsonFile.getName());
            try {
                FileUtils.moveFile(jsonFile,new File(getDonePath(type)+File.separator+"emptyFile"+File.separator+jsonFile.getName()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            return true;
        }
        return false;
    }

    private String getDonePath(String type){
        return dirPath + File.separator+"dnoe"+File.separator+type+File.separator+ LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    private String jsonArr2String(String arr){
        if(null == arr || "[]".equals(arr)){return null; }
        else return arr;
    }
}