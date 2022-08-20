package com.tkx.java.基础;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月19日 10:49
 */
public class CloneDemo {
    public static void main(String[] args) {
        Person person1 = new Person(new Address("武汉"));
        Person person1Copy = person1.clone();
// true
        System.out.println(person1.getAddress() == person1Copy.getAddress());
    }
}

 class Address implements Cloneable{
    private String name;
    // 省略构造函数、Getter&Setter方法

     public Address(String name) {
         this.name = name;
     }

     @Override
    public Address clone() {
        try {
            return (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }
 }

 class Person implements Cloneable {
    private Address address;
    // 省略构造函数、Getter&Setter方法

     public Person(Address address) {
         this.address = address;
     }

    //浅拷贝
    //  @Override
    // public Person clone() {
    //     try {
    //         Person person = (Person) super.clone();
    //         return person;
    //     } catch (CloneNotSupportedException e) {
    //         throw new AssertionError();
    //     }
    // }
    //深拷贝
    @Override
    public Person clone() {
        try {
            Person person = (Person) super.clone();
            person.setAddress(person.getAddress().clone());
            return person;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
     public Address getAddress() {
         return address;
     }

     public void setAddress(Address address) {
         this.address = address;
     }
 }
