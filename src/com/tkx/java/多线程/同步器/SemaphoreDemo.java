package com.tkx.java.多线程.同步器;

import java.util.concurrent.Semaphore;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月20日 20:08
 */
public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(5);

        for (int i = 0; i < 100; i++) {
            Thread thread  = new Thread(()->{
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName()+"成功进入停车场");
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName()+"驶出停车场");
                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            thread.start();
        }
    }
}
