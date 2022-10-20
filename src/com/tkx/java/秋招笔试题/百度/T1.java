package com.tkx.java.秋招笔试题.百度;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月20日 19:36
 */
public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = 0; // 表示回复的数量
        int n2 = 0; // 表示点赞的数量
        for (int i = 0; i < n; i++) {
            int num  =sc.nextInt();
            if(num==1) n1++;
            if(num==2) n2++;
            if(num==3){
                if(n1>n2) n1++;
                else if(n2>n1) n2++;
                else {
                    n1++;
                    n2++;
                }
            }
        }
        System.out.println(n1+" "+n2);
    }
}
