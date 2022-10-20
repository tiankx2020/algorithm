package com.tkx.java.秋招笔试题.蚂蚁;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月22日 9:39
 */
public class T3 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int[][] arr = new int[n][n];
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<n;j++){
    //             arr[i][j] = i*3+j+1;
    //         }
    //     }
    //
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<n;j++){
    //             if(i+1<n && j+1<n){
    //                 int sum = arr[i][j]+arr[i+1][j]+arr[i][j+1]+arr[i+1][j+1];
    //                 boolean f = false;
    //                 if(sum%2==0){
    //                     if(j+2<n&&arr[i][j+1]+arr[i][j+2]%2==0){
    //                        int tmp = arr[i][j+1];
    //                        arr[i][j+1] = arr[i][j+2];
    //                        arr[i][j+2] = tmp;
    //                        f = true;
    //                        continue;
    //                     }
    //                     if(i+)
    //                 }
    //                 if(f==false){
    //                     System.out.println(-1);
    //                     return;
    //                 }
    //             }
    //         }
    //     }
    // }

    public static void swap(int[] arr,int x,int y){
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }
}
