package com.credan.data.inport;

import com.credan.data.inport.dao.PhoneBlacklistFraudGroupMapper;
import com.credan.data.inport.entity.PhoneBlacklistFraudGroup;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataInportApplicationTests {

	private final Logger log = LoggerFactory.getLogger(this.getClass());



	@Autowired
	private PhoneBlacklistFraudGroupMapper groupMapper;

	@Test
	public void test11(){
		List<PhoneBlacklistFraudGroup> list = groupMapper.selectAll();
		int nThreads = Runtime.getRuntime().availableProcessors();
		ExecutorService es = Executors.newFixedThreadPool(nThreads);

		list.forEach(p -> es.submit(new Thread(() -> baiduSearch5(p.getPhone()))));

		System.out.println("已经开启所有的子线程");
		es.shutdown();
		System.out.println("shutdown()：启动一次顺序关闭，执行以前提交的任务，但不接受新任务。");
		while(true){
			if(es.isTerminated()){
				System.out.println("所有的子线程都结束了！");
				break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public static void baiduSearch5(String key) {

		Pattern p = Pattern.compile("(用户标记为<strong>\")(.*)(\"</strong>,供您参考。)");
		//Pattern p = Pattern.compile("飞贷|手机贷");

		try {
			key = URLEncoder.encode(key, "gb2312");
			URL u = new URL("http://www.baidu.com.cn/s?wd=" + key + "&cl=3");
			URLConnection conn = u.openConnection();
			conn.setConnectTimeout(10000);
			conn.setReadTimeout(10000);
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					conn.getInputStream(), "utf8"));
			String str = reader.readLine();
			while (str != null) {
				Matcher m = p.matcher(str);
				while (m.find()){
					String tagName = m.group(2);
					System.out.println(key+"	"+tagName);
					//System.out.println(key+"	"+tagName);
				}
				str = reader.readLine();
			}
			//System.out.println("========================================");
			reader.close();
		} catch (Exception ex) {
			System.err.format("error phone: %s ,reason: %s \n",key, ex.getMessage());
			ex.printStackTrace();
		}
	}



}
