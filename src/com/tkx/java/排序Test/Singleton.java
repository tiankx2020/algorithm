package com.tkx.java.排序Test;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年08月13日 10:06
 */
public class Singleton {
    private static volatile Singleton singleton;

    public Singleton() {
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) {
        Singleton s1 = getSingleton();
        Singleton s2 = getSingleton();
        System.out.println(s1==s2);
    }
}
