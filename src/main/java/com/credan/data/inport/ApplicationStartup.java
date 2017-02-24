package com.credan.data.inport;

import com.credan.data.inport.dao.DataChsiMapper;
import com.credan.data.inport.entity.DataChsi;
import com.credan.data.inport.service.watch.WatchDir;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

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

    private ObjectMapper mapper;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DataChsiMapper chsiMapper;


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
                mapper = new ObjectMapper();
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

            if(jsonFile.getName().endsWith("_学信网数据.txt")){
                DataChsi dataChsi = null;
                try {
                    dataChsi = mapper.readValue(jsonFile, DataChsi.class);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                logger.info("fileName :{} ,parse json :{}",jsonFile.getName(),dataChsi);
                chsiMapper.insertSelective(dataChsi);
            }else if(jsonFile.getName().endsWith("_运营商数据.txt")){

            }else if(jsonFile.getName().endsWith("")){

            }else {
                return null;
            }

            try {
                FileUtils.moveFile(jsonFile,new File(getDonePath()+File.separator+jsonFile.getName()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            return jsonFile.getName();
        }
    }

    private String getDonePath(){
        return dirPath + File.separator+"dnoe"+File.separator+ LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
}