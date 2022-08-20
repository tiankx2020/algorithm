package com.tkx.java.多线程.reentrantlock;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月19日 10:23
 */
public class ReentrantLockDemo {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();

    }
}
