package com.credan.data.inport.service;

import java.io.IOException;
import java.nio.file.*;

public class DirectoryWatcher implements Runnable {
    private final Path path; // 监控目录
    private final WatchService watchService;

    public DirectoryWatcher(Path path) {
        this.path = path;
        try {
            this.watchService = FileSystems.getDefault().newWatchService();
        } catch (IOException e) {
            throw new RuntimeException("初始化 watchService 出错", e);
        }
    }


    @Override
    public void run() {
        try {
            path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE);
        } catch (IOException e) {
            throw new RuntimeException("注册监控事件出错", e);
        }

        while (!Thread.interrupted()) {
            if (!watch()) {
                break;
            }
        }

        try {
            watchService.close();
        } catch (IOException e) {
            throw new RuntimeException("关闭 watchService 出错", e);
        }
    }

    private boolean watch() {
        WatchKey signal;
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
            System.out.println("事件：" + event.kind() + "，" + "文件名：" + event.context());
        }

        // 重置并继续监控
        return signal.reset();
    }

}