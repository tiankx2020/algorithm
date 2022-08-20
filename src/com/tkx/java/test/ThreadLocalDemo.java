package com.tkx.java.test;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年03月30日 11:18
 */
public class ThreadLocalDemo {
    public static ThreadLocal local = new ThreadLocal();
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            local.set(1);
        },"t1");
        t1.start();
        Thread.sleep(100);
        Thread t2 = new Thread(()->{
            Object o = local.get();
            System.out.println(o);
        },"t2");
        t2.start();

    }
}
