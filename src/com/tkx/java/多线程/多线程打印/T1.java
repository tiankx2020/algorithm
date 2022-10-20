package com.tkx.java.多线程.多线程打印;

/**
 * 线程t1 打印12345678
 * 线程t2 打印abcdefg
 * 关键词 synchronized
 */
public class T1 {
    public static int index = 0;
    public static Object object = new Object();
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            String s = "12345678";
            for (int i = 0; i < s.length(); i++) {
                synchronized (object){
                    if(index%2!=0){
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.print(s.charAt(i));
                    index++;
                    object.notifyAll();
                }
            }
        }, "t1");

        Thread t2 = new Thread(() -> {
            String s = "abcdefgh";
            for (int i = 0; i < s.length(); i++) {
                synchronized (object){
                    if(index%2!=1){
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.print(s.charAt(i));
                    index++;
                    object.notifyAll();
                }
            }
        }, "t2");
        t1.start();
        t2.start();
    }
}
