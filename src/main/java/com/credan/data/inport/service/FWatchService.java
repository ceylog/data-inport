package com.credan.data.inport.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.WatchService;

/**
 * @Author Sam Wang
 * @Date 2017/2/21.
 * @Version 0.0.1
 */
@Service
public class FWatchService {

    @Value("${watch.path}")
    private String path;

    private WatchService watchService;

    private WatchKey signal;

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostConstruct
    private void init() {


        Path dir = Paths.get(path);
        try {
            watchService = FileSystems.getDefault().newWatchService();
            logger.info("watchService 初始化完成");
            dir.register(watchService, StandardWatchEventKinds.ENTRY_CREATE,StandardWatchEventKinds.ENTRY_DELETE);
            logger.info("注册事件完成");

        }catch(IOException e){
            logger.error("error", e);
        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (!Thread.interrupted()) {
                    if (!watch()) {
                        break;
                    }
                }
            }
        }).start();

    }

    private boolean watch() {
        try {
            // 等待监控信号
            signal = watchService.take();
        } catch (InterruptedException e) {
            return false;
        }

        // 处理监控事件
        for (WatchEvent<?> event : signal.pollEvents()) {
            WatchEvent.Kind<?> kind = event.kind();
            // 处理 OVERFLOW 事件
            if (StandardWatchEventKinds.OVERFLOW.equals(kind)) {
                continue;
            }
            logger.info("事件：{} , 文件名：{}",event.kind(),event.context());
        }
        // 重置并继续监控
        return signal.reset();
    }
}
