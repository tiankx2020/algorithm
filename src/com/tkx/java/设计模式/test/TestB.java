package com.tkx.java.设计模式.test;


/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年11月12日 19:14
 */
public class TestB extends TestA {

    public TestB() {
        System.out.println("TestB无参的构造方法生效了");
    }

    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        System.out.println(l);
        TestB testB = new TestB();
    }
}
