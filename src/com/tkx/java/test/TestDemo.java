package com.tkx.java.test;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月10日 10:05
 */
public class TestDemo {
    public static void main(String[] args) {
        System.out.println(method("1", "2", "3", "4", "5"));

    }

    public static String method(String ...str){
        StringBuilder sb = new StringBuilder();
        for (String s : str) {
            sb.append(s);
        }
        return sb.toString();
    }
}
