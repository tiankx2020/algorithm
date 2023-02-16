package com.tkx.java.秋招笔试题.微盟;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年11月03日 15:15
 */
public class Singleton {
    // 保证
    private static volatile Singleton singleton;

    // 无参数的构造方法
    private Singleton() {
    }

    public static Singleton getSingleton() {
        //
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
