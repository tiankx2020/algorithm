package com.tkx.java.笔试题.百度2022;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月19日 19:10
 */
public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        long ans = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int x = sc.nextInt();
                ans+=x;
            }
        }
        System.out.println(ans);
    }
}
