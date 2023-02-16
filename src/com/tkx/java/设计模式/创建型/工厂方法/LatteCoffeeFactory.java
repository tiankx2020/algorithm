package com.tkx.java.设计模式.创建型.工厂方法;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年10月27日 9:37
 */
public class LatteCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
