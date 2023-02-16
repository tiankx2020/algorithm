package com.tkx.java.秋招笔试题.微盟;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年11月03日 11:36
 */
public class T2 {
    static int index = 0;
    public static void main(String[] args) {
        String s = "123456789";
        Object o = new Object();
        Thread t1 = new Thread(()->{
            for (; index< s.length(); ) {
                    synchronized (o){
                        if(index%2!=0){
                            try {
                                o.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.println(Thread.currentThread().getName()+":"+index);
                        index++;
                        o.notifyAll();
                    }
            }
        });
        Thread t2 = new Thread(()->{
            for (; index< s.length(); ) {
                synchronized (o){
                    if(index%2!=1){
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName()+":"+index);
                    index++;
                    o.notifyAll();
                }
            }
        });
        t1.start();
        t2.start();
    }
}
