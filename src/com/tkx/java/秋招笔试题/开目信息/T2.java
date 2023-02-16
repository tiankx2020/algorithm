package com.tkx.java.秋招笔试题.开目信息;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年11月03日 10:06
 */
public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k, n;
        double sn = 0;
        k = sc.nextInt();
        for(n =1;; n++){
            sn +=1.0/ n;
            if(sn >k) break;
        }
        System.out.println(n);
    }
}
