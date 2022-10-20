package com.tkx.java.每日一题;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月29日 14:55
 */
public class ThreadDemo {
    private static final  Object  object  = new Object();
    private static int index = 1;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
        }, "t1");
        Thread t2 = new Thread(() -> {
        }, "t2");
        t1.start();
        t2.start();
    }
}
