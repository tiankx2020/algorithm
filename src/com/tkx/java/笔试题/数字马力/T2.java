package com.tkx.java.笔试题.数字马力;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年10月15日 18:08
 */
public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=  sc.nextLine();
        int res = 0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==' ') break;
            res++;
        }
        System.out.println(res);
    }
}
