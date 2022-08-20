package com.tkx.java.test;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月10日 10:18
 */
public class ExtendsDemo {
    private String name;
    private int age;

    public ExtendsDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

}

class Son extends ExtendsDemo{
    // public static void main(String[] args) {
    //     Son tkx = new Son("tkx", 18);
    //     System.out.println(tkx.getAge());
    // }
    public Son(String name, int age) {
        super(name, age);
    }
}
