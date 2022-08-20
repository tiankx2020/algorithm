package com.tkx.java.面试题.metaApp.M2;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月16日 16:14
 */
public class SingletonDemo {

    private static volatile SingletonDemo singletonDemo;
    private SingletonDemo(){}
    public static SingletonDemo getSingleton(){
        if(singletonDemo==null){
            //t1, t2
            synchronized (SingletonDemo.class){
                if(singletonDemo==null){
                    singletonDemo =  new SingletonDemo();
                }
            }
        }
        return singletonDemo;
    }
}
