package com.tkx.java.笔试题.百度2022;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月19日 19:20
 */
public class T2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        long ans = 0;
        int n=sc.nextInt(),k = sc.nextInt();
        k = k-1;
        int[] arr  = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        if(arr[k]==1){
            long tmp1=0,tmp2=0;
            for(int i=k+1;i<n;i++){
                tmp1+=arr[i];
                if(arr[i]<=1) break;
            }
            for(int i=k-1;i>=0;i--){
                tmp2+=arr[i];
                if(arr[i]<=0) break;
            }
            ans = Math.max(tmp1,tmp2)+arr[k];
        }else{
            for(int i=k+1;i<n;i++){
                ans+=arr[i];
                if(arr[i]<=1) break;
            }
            for(int i=k-1;i>=0;i--){
                ans+=arr[i];
                if(arr[i]<=1) break;
            }
            ans = ans+arr[k];
        }
        System.out.println(ans);
    }
}
