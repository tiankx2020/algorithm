package com.tkx.java.help.网易;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年08月20日 16:22
 */

// 三元组个数
public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        long ans = 0;
        for(int i=0;i<arr.length-2;i++){
            int tmp = 0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    tmp++;
                }
                if(arr[j]==arr[i]){
                    ans+=tmp;
                }
            }
        }
        System.out.println(ans);
    }
}
