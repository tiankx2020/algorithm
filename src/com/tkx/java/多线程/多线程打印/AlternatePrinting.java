package com.tkx.java.多线程.多线程打印;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2023年02月16日 16:15
 */
public class AlternatePrinting {
    public static void main(String[] args) {
        final Object lock = new Object(); // 创建共享锁
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition c1 = reentrantLock.newCondition();
        Condition c2 = reentrantLock.newCondition();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                synchronized (c1) { // 获取共享锁
                    System.out.print("A");
                    c2.notify();
                    try {
                        c1.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                synchronized (c2) { // 获取共享锁
                    System.out.print("B");
                    c1.notify();
                    try {
                        c2.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t1.start();
        t2.start();
        // System.out.println("哈哈哈");
    }
}
