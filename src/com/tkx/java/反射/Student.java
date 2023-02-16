package com.tkx.java.反射;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年10月24日 16:12
 */
public class Student {
    private Integer id;
    private String name;
    public Integer age;
    public Integer getId() {
        return id;
    }

    private void privateMethod(){
        System.out.println("这是一个私有方法");
    }

    public void publicMethod(){
        System.out.println("这是一个工友方法");
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // 获取反射的常见方式
        Class<Student> studentClass = Student.class;
        String name = studentClass.getName();
        String simpleName = studentClass.getSimpleName();
        // 获取public方法
        Method[] methods = studentClass.getMethods();
        // 获取所有方法
        Method[] declaredMethods = studentClass.getDeclaredMethods();
        // 获取公有方法
        Field[] fields = studentClass.getFields();
        // 获取所有字段
        Field[] declaredFields = studentClass.getDeclaredFields();

        System.out.println(name);
        // 简单名字
        System.out.println(simpleName);

        for (Method method : methods) {
            System.out.println(method.getName());
        }
        System.out.println("---------------------------");
        for (Method declaredMethod : declaredMethods) {
            String declaredMethodName = declaredMethod.getName();
            System.out.println(declaredMethodName);
        }
        Student student = new Student();
        System.out.println("---------------------");
        Method privateMethod = studentClass.getDeclaredMethod("privateMethod");
        privateMethod.invoke(student,null);
    }

}
