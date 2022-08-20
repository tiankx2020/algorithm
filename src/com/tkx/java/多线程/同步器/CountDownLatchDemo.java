package com.tkx.java.多线程.同步器;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月20日 20:09
 */
public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch cdl = new CountDownLatch(5);
        ExecutorService pool = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 5; i++) {
            int t = i;
            pool.execute(()->{
                System.out.println(t);
                cdl.countDown();
            });
        }
        cdl.await();
        System.out.println("我执行完了");

    }
}
