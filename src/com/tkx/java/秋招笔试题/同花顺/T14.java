package com.tkx.java.秋招笔试题.同花顺;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月05日 14:11
 */
public class T14 {
    public static void main(String[] args) {
        String s = "hello,W";
        method(s);

    }

    public static void method(String s){
        StringBuilder sb  = new StringBuilder();
        for (char c : s.toCharArray()) {
            if(c>='a' && c<='z'){
                c =(char)(c-32);
            }
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
