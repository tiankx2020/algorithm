package com.tkx.java.多线程.syn;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月12日 18:53
 */
public class SynDemo {
    public static Object object = new Object();
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            synchronized (object){
                try {
                    object.wait();
                    System.out.println("hello1");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"t1");
        t1.start();

        Thread t2 = new Thread(()->{
            synchronized (object){
                System.out.println("hello2");
                object.notify();;
            }
        },"t2");
        t2.start();
    }
}
