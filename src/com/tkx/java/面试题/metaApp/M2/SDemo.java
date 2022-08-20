package com.tkx.java.面试题.metaApp.M2;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月16日 16:18
 */
public class SDemo {
    public static void main(String[] args) {
        SingletonDemo s1 = SingletonDemo.getSingleton();
        SingletonDemo s2 = SingletonDemo.getSingleton();
        System.out.println(s1 == s2);
    }
}
