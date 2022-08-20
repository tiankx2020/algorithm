package com.tkx.java.面试题.即构;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月20日 10:59
 */
public class Singleton {
    private static  volatile  Singleton singleton;
    private Singleton(){}

    public static Singleton getSingleton(){
        if(singleton==null){
            synchronized (Singleton.class){
                if(singleton==null){
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
