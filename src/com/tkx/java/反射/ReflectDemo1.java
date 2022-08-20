package com.tkx.java.反射;

import netscape.security.UserTarget;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月10日 16:47
 */
public class ReflectDemo1 {
    public static void main(String[] args) {
        try {
            Student student = Student.class.newInstance();
            Student student2 =(Student)Class.forName("com.tkx.java.反射.Student").newInstance();
            System.out.println(student == student2);
            System.out.println("-------------类名--------------");
            System.out.println(Student.class.getSimpleName());
            System.out.println("-------------全限定名--------------");
            System.out.println(Student.class.getName());
            Constructor<?>[] declaredConstructors = Student.class.getDeclaredConstructors();
            System.out.println("-------------构造方法--------------");
            for (Constructor<?> declaredConstructor : declaredConstructors) {
                System.out.println(declaredConstructor);
            }
            System.out.println("-------------所有字段-----------------");
            Field[] declaredFields = Student.class.getDeclaredFields();
            for (Field declaredField : declaredFields) {
                System.out.println(declaredField);
            }
            Field name = Student.class.getDeclaredField("name");
            //不加这个，会报
            name.setAccessible(true);
            name.set(student,"tkx");
            Field nickName = Student.class.getDeclaredField("nickName");
            nickName.set(student,"girl");
            System.out.println(student);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }
}
