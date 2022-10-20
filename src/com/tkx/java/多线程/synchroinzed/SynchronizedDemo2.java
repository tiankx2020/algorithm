package com.tkx.java.多线程.synchroinzed;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月26日 11:48
 */
public class SynchronizedDemo2 {
    Object object = new Object();
    public void method1() {
        synchronized (object) {

        }
        // method2();
    }

    private static void method2() {

    }
}
