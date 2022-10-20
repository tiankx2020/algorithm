package com.tkx.java.多线程.synchroinzed;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月26日 11:42
 */
public class ThreadDemo extends Thread{
    @Override
    public synchronized void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
