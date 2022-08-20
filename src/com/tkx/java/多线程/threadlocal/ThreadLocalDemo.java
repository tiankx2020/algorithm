package com.tkx.java.多线程.threadlocal;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月10日 18:53
 */
public class ThreadLocalDemo  {
    public static void main(String[] args) {
        ThreadLocal threadLocal = new ThreadLocal();
        Thread thread1 = new Thread(()->{
            threadLocal.set("哈哈");
            System.out.println("t1");
            System.out.println(threadLocal.get());
        },"t1");
        Thread thread2 = new Thread(()->{
            System.out.println(threadLocal.get());
            System.out.println("t2");
        },"t2");
        thread1.start();
        thread2.start();
    }

}
