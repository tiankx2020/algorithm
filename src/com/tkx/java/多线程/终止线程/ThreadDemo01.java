package com.tkx.java.多线程.终止线程;

import com.tkx.java.多线程.ThreadDemo;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月10日 16:12
 */
public class ThreadDemo01  {

    public static void main(String[] args) throws InterruptedException {
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();
        Thread.sleep(100);
        // threadDemo.stop();
        threadDemo.interrupt();
    }
}
