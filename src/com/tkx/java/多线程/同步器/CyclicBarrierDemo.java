package com.tkx.java.多线程.同步器;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月20日 20:14
 */
public class CyclicBarrierDemo {
    public static void main(String[] args) throws BrokenBarrierException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(10000);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(1000,()->{
            System.out.println("我复活了");
        });
        for (int i = 0; i < 100; i++) {
            int t = i;
            pool.execute(()->{
                System.out.println("哈哈"+t);
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            });

        }
    }
}
