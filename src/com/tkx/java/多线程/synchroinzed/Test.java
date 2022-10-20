package com.tkx.java.多线程.synchroinzed;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月26日 11:42
 */
public class Test {
    public static void main(String[] args) {
        ThreadDemo demo1 = new ThreadDemo();
        ThreadDemo demo2 = new ThreadDemo();
        // 相当于用这个对象启用，发动了两次线程
        demo1.start();
        demo2.start();
    }
}
