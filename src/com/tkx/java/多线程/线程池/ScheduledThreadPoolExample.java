package com.tkx.java.多线程.线程池;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *  使用ScheduleThreadPool做定时任务
 */
public class ScheduledThreadPoolExample {
    public static void main(String[] args) throws InterruptedException {
        // 创建ScheduleThreadPool线程池
        ScheduledExecutorService threadPool = Executors.newScheduledThreadPool(10);
        System.out.println("schedule添加定时任务:"+ LocalDateTime.now());

        // 执行一次
        // threadPool.schedule(()->{
        //     System.out.println("执行 schedule 方法：" + LocalDateTime.now());
        // },3, TimeUnit.SECONDS); // 3秒之后执行
        // TimeUnit.SECONDS.sleep(10); // 休眠 10s
        // System.out.println("当前时间：" + LocalDateTime.now());


        // 定时任务循环执行
        threadPool.scheduleAtFixedRate(()->{
            System.out.println("执行 scheduleAtFixedRate 方法：" + LocalDateTime.now());
            // 休眠 2s
            // try {
            //     TimeUnit.SECONDS.sleep(2);
            // } catch (InterruptedException e) {
            //     e.printStackTrace();
            // }
        },3L,2L,TimeUnit.SECONDS);
    }
}
