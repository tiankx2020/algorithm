package com.tkx.java.秋招笔试题.顺丰;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年11月10日 16:27
 */
public class Singleton {

    // volatile 防止指令重排
    private static volatile  Singleton singleton = null;

    // 私有化构造方法
    private Singleton(){}

    public static Singleton getSingleton() {
        // t2
        if(singleton == null){
            synchronized (Singleton.class){
                // 双重检验
                if(singleton == null){
                     // 1.分配内存  2.初始化内存 3.将变量指向内存
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
