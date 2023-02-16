package com.tkx.java.多线程.volatile_demo;

import lombok.SneakyThrows;

/**
 * @Description: volatile解决有序性问题
 * @author: scott
 * @date: 2022年10月25日 11:16
 */
public class VolatileTest {
     int a = 1;
     int b = 2;

    public  void change() {
        a = 3;
        b = a;
    }

    public static void main(String[] args) {
        while (true){
            VolatileTest test = new VolatileTest();
            new Thread(()->{
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                test.change();
            }).start();

            new Thread(()->{
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("a = "+test.a);
                System.out.println("b = "+test.b);
            }).start();
        }
    }
}
