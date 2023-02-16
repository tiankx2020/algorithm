package com.tkx.java.设计模式.创建型.工厂方法;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年10月27日 9:43
 */
public class AmericanCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
