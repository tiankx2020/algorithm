package com.tkx.java.多线程.reentrantlock;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月19日 10:23
 */
public class ReentrantLockDemo {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        Condition c1 = lock.newCondition();
        lock.lock();
        try {

        }catch (Exception e){

        }finally {
            lock.unlock();
        }
    }
}
