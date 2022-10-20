package com.tkx.java.笔试题.数字马力;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年10月15日 18:06
 */
public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=  sc.nextLine();
        int res = 0;
        for (char c : str.toCharArray()) {
            if(c>='A' && c<='Z'){
                res++;
            }
        }
        System.out.println(res);
    }
}
