package com.tkx.java.秋招笔试题.同花顺;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月05日 13:45
 */
public class CountThread10 {
    private static Integer count = 0;
    private static final Integer THREAD_NUM = 5;
    private static final Integer THREAD_PER_COUNT = 20000;
    public static void main(String[] args) throws InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(THREAD_NUM);
        CountDownLatch countDownLatch = new CountDownLatch(5);
        for (Integer i = 0; i < THREAD_NUM; i++) {
            pool.execute(()->{
                synchronized (CountThread10.class){
                    for (Integer j = 0; j < THREAD_PER_COUNT; j++) {
                        count++;
                    }
                    countDownLatch.countDown();
                }

            });
        }
        countDownLatch.await();
        System.out.println(count);
    }
}
