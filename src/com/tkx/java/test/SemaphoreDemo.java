package com.tkx.java.test;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年03月30日 15:01
 */
public class SemaphoreDemo {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);
        Semaphore semaphore = new Semaphore(5);
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int t = i;
            new Thread(()->{
                try {
                    semaphore.acquire();
                    System.out.println("第"+t+"辆车入库");
                    Thread.sleep(r.nextInt(2000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    semaphore.release();
                    System.out.println("第"+t+"辆车出库");
                }

            }).start();
        }
    }
}
