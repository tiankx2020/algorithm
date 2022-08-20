package com.tkx.java.笔试题.微众银行2022暑期实习;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月20日 19:35
 */
public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        long[] arr1 = new long[n];
        long[] arr2 = new long[n];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
            if(i>0){
                arr1[i]+=arr1[i-1];
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = sc.nextInt();
            if(i>0){
                arr2[i]+=arr2[i-1];
            }
        }
        long ans =  0 ;
        for(int i=0;i<n;i++){
            if(arr1[i]<=arr2[i]){
                long sub = arr2[i]-arr1[i]+1;
                // if(sub%(i+1)!=0){
                //     ans = Math.max(ans,sub/(i+1)+1);
                // }else{
                //     ans = Math.max(ans,sub/(i+1));
                // }
                ans = Math.max(ans,(sub+i)/(i+1));
            }
        }
        System.out.println(ans);

    }
}
