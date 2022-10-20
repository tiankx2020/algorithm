package com.tkx.java.秋招笔试题.蚂蚁;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月22日 10:07
 */
public class T2Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        long k = sc.nextInt();
        int kLen = (k+"").length();
        int sLen = s.length();
        long res = 0;
        for(int len=1;len<kLen&&len<=sLen;len++){
            res+=(sLen-len+1);
        }
        for(int i=0;i+kLen<=s.length();i++){
            String tmp = s.substring(i,i+kLen);
            if(tmp.compareTo(k+"")<0) res++;
        }
        System.out.println(res);
    }
}
