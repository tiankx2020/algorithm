package com.tkx.java.多线程.多线程打印;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 *  * 线程t1 打印12345678
 *  * 线程t2 打印abcdefg
 *  * 关键词 ReentrantLock
 */
public class T2 {
    public static int index = 0;
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        Condition c1 = lock.newCondition();
        Condition c2 = lock.newCondition();

        Thread t1 = new Thread(()->{
            String s = "12345678";
            for (int i = 0; i < s.length(); i++) {
                lock.lock();
                try {
                    if(index%2!=0){
                        try {
                            c1.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(s.charAt(i));
                    index++;
                    c2.signal();
                }finally {
                    lock.unlock();
                }

            }
        },"t1");

        Thread t2 = new Thread(()->{
            String s = "abcdefg";
            for (int i = 0; i < s.length(); i++) {
                lock.lock();
                try {
                    if(index%2!=1){
                        try {
                            c2.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(s.charAt(i));
                    index++;
                    c1.signal();
                }finally {
                    lock.unlock();
                }

            }
        },"t2");

        t1.start();
        t2.start();
    }
}
