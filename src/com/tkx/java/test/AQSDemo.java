package com.tkx.java.test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年03月30日 13:59
 */
public class AQSDemo {
    public  int a= 5;
    private String str = "kkk";
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        String s = "hello,world";
        lock.lock();

        lock.unlock();
    }
}
