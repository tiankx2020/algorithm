package com.tkx.java.多线程.多线程打印;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2023年02月16日 16:15
 */
public class AlternatePrinting {
    public static void main(String[] args) {
        final Object lock = new Object(); // 创建共享锁
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                synchronized (lock) { // 获取共享锁
                    System.out.print("A");
                    lock.notifyAll(); // 唤醒等待线程
                    try {
                        lock.wait(); // 等待锁释放
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                synchronized (lock) { // 获取共享锁
                    System.out.print("B");
                    lock.notifyAll(); // 唤醒等待线程
                    try {
                        lock.wait(); // 等待锁释放
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
