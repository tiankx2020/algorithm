package com.tkx.java.秋招笔试题._360;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月24日 15:03
 */
public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        long res = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                for(int k=1;k<=arr[i][j];k++){
                        // 上
                        if(arr[i][j]==k) res++;
                        // 下
                        if(k==1) res++;
                        // 左
                        if(!(i-1>=0&&arr[i-1][j]>=k)){
                            res++;
                        }
                        // 右
                        if(!(i+1<n&&arr[i+1][j]>=k)){
                            res++;
                        }
                        // 前
                        if(!(j+1<m&&arr[i][j+1]>=k)){
                            res++;
                        }
                        // 后
                        if(!(j-1>=0&&arr[i][j-1]>=k)){
                            res++;
                        }
                    }
                }
            }
        System.out.println(res);
        }
}
