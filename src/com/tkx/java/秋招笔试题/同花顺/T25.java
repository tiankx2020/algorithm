package com.tkx.java.秋招笔试题.同花顺;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月05日 14:08
 */
public class T25 {
    public static void main(String[] args) {
        for (int i = 1; i <= 999; i++) {
            String s = ""+i;
            if(!s.contains("5")){
                System.out.println(s);
            }
        }
    }
}
