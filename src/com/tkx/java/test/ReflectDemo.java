package com.tkx.java.test;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Stack;
import java.util.concurrent.Executors;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月29日 9:55
 */
public class ReflectDemo {
    public static void main(String[] args) {
        Stack<TreeNode> stack = new Stack<>();
        
    }

    @Test
    public void method1(){
        System.out.println(TreeNode.class.getName());
        Field[] declaredFields = TreeNode.class.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }
    }
}
