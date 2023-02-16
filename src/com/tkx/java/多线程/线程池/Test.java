package com.tkx.java.多线程.线程池;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月09日 10:43
 */
public class Test {
    /**
     * 测试自定义的线程池
     * @param args
     */
    public static void main(String[] args) {
        // 核心线程数
        int corePoolSize = 3;
        // 最大线程数
        int maximumPoolSize = 6;
        // 超过 corePoolSize 线程数量的线程最大闲暇工夫
        long keepAliveTime = 2;
        // 以秒为工夫单位
        TimeUnit unit = TimeUnit.SECONDS;
        // 创立工作队列，用于寄存提交的期待执行工作
        BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(2);
        ThreadPoolExecutor threadPoolExecutor = null;
        try {
            //创立线程池
            threadPoolExecutor = new ThreadPoolExecutor(corePoolSize,
                    maximumPoolSize,
                    keepAliveTime,
                    unit,
                    workQueue,
                    new ThreadPoolExecutor.AbortPolicy());

            //循环提交工作
            for (int i = 0; i < 8; i++) {
                //提交工作的索引
                final int index = (i + 1);
                threadPoolExecutor.submit(() -> {
                    //线程打印输出
                    System.out.println("大家好，我是线程：" + index);
                    try {
                        //模仿线程执行工夫，10s
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
                //每个工作提交后休眠500ms再提交下一个工作，用于保障提交程序
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
    // 堆排
}
