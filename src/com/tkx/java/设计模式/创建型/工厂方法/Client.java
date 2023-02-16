package com.tkx.java.设计模式.创建型.工厂方法;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年10月27日 9:38
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();

        coffeeStore.setFactory(new LatteCoffeeFactory());

        coffeeStore.orderCoffee();
    }
}
