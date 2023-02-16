package com.tkx.java.设计模式.创建型.工厂方法;

/**
 * 咖啡类
 */
public abstract class Coffee {
    public abstract String getName();

    public void addSugar() {
        System.out.println("加糖");
    }

    public void addMilk() {
        System.out.println("加奶");
    }
}
