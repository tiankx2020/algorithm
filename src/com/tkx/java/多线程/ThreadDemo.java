package com.tkx.java.多线程;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月10日 16:12
 */
public class ThreadDemo extends Thread{
    @Override
    public void run() {
        // System.out.println("重写run方法");
        for (int i = 0; i < 10000000; i++) {
            System.out.println(i);
        }
    }
}
