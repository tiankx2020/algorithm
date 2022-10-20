package com.tkx.java.动态代理;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月15日 9:05
 */
public class SynchronizedObjectLock {
    public static void main(String[] args) {
        SynchronizedDemo s1 = new SynchronizedDemo();
        s1.start();
    }
}

class  SynchronizedDemo extends Thread{

    @Override
    public void run() {
        synchronized (this) {
            System.out.println("我是线程" + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "结束");
        }
    }
}
