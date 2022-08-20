package com.tkx.java.多线程.终止线程;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月10日 16:23
 */
public class InterruptThread1  extends Thread{
    public static void main(String[] args) {
        try {
            InterruptThread1 t = new InterruptThread1();
            t.start();
            Thread.sleep(200);
            t.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 200000; i++) {
            //判断是否被打断
            if(Thread.currentThread().isInterrupted()){
                System.out.println(Thread.currentThread().isInterrupted());
                break;
            }
            System.out.println("i=" + i);
        }
    }
}
