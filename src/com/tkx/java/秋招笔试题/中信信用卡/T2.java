package com.tkx.java.秋招笔试题.中信信用卡;


import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月22日 16:09
 */
public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s  =sc.nextLine();
        s = s.toUpperCase();
        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            if(cs[i] == 'A' || cs[i] == 'E' || cs[i] == 'I' || cs[i]=='O' || cs[i] == 'U'){
                cs[i]+=32;
            }
        }
        System.out.println(String.valueOf(cs));
    }

}
