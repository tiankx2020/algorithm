package com.tkx.java.多线程.创建线程;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年10月04日 20:41
 */
public class RunnableDemo  implements Runnable{
    @Override
    public void run() {
        System.out.println("使用Runnable创建线程");
    }

    public static void main(String[] args) {
        RunnableDemo demo = new RunnableDemo();
        Thread thread = new Thread(demo);
        thread.start();
    }
}
