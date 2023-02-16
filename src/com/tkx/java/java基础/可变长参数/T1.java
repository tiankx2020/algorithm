package com.tkx.java.java基础.可变长参数;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年12月07日 8:11
 */
public class T1 {

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        method(s1,s2);
    }

    public static void method(String ...args){
        for (String arg : args) {
            System.out.println("传入的参数为:"+arg);
        }
    }
}
