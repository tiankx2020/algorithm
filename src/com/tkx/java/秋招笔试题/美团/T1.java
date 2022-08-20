package com.tkx.java.秋招笔试题.美团;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年08月20日 10:04
 */
public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s1 = sc.next();
        String s2 = sc.next();
        StringBuilder sb = new StringBuilder();
        for(int i=0,j=0;i<n*2;i++,j=1-j){
            if(j==0){
                sb.append(s1.charAt(i/2));
            }else{
                sb.append(s2.charAt(i/2));
            }
        }
        System.out.println(sb.toString());
    }
}
