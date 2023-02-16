package com.tkx.java.多线程.volatile_demo;

/**
 * @Description: volatile可以防止编译器的  指令重排
 * @author: scott
 * @date: 2022年10月25日 11:08
 */
public class Singleton {
    private static volatile Singleton singleton;

    public static Singleton getSingleton(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    // 创建对象的大致步骤
                    // 1.分配内存空间
                    // 2.在该内存空间上初始化对象
                    // 3.将变量指向这个内存空间

                    // 2和3颠倒,在多线程环境下就可能将一个未初始化的对象引用暴露出来，从而导致一个不可预料的结果
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
