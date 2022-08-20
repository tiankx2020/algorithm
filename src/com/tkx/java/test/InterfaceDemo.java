package com.tkx.java.test;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年03月30日 9:40
 */
public class InterfaceDemo {
}

interface Interface1{
    void method1();

    default void defaultMethod(){
        System.out.println("我是一个默认方法");
    }
}
