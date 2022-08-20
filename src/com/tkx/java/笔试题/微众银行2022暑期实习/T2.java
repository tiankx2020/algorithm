package com.tkx.java.笔试题.微众银行2022暑期实习;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月20日 19:46
 */
public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        long[] dp = new long[n];
        long ans = n;
        Arrays.fill(dp,1);
        for(int k=2;k<=n;k++){
            long[] tmp = new long[n];
            for(int i=0;i<n;i++){
                for(int j=0;j<i;j++){
                    if(arr[j]<arr[i]){
                        tmp[i]+=dp[j];
                        ans+=dp[j];
                    }
                }
            }
            dp = tmp;
            System.out.println(Arrays.toString(dp));
        }
        System.out.println(ans%1000000007);
    }
}
