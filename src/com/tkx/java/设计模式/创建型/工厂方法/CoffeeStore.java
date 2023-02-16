package com.tkx.java.设计模式.创建型.工厂方法;

public class CoffeeStore  {
    private CoffeeFactory factory;


    public void setFactory(CoffeeFactory factory){
        this.factory = factory;
    }

    public Coffee orderCoffee(){
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

}
