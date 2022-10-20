package com.tkx.java.秋招笔试题.同程旅行;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月14日 20:05
 */
public class T2 {
    public static void main(String[] args) {
        int[] arr ={100,-23,-23,404,100,23,23,23,3,404};
        System.out.println(minJumps(arr));
    }
    public static int minJumps (int[] arr) {
        int[] dp = new int[arr.length];
        Arrays.fill(dp,arr.length);
        dp[0] = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i-1;j<arr.length;j++){
                if(j==i-1 && j>=0){
                    dp[j] = Math.min(dp[j],dp[i]+1);
                }
                if(j==i+1&&j<arr.length){
                    dp[j] = Math.min(dp[j],dp[i]+1);
                }
                if(j>=0&&arr[i]==arr[j]){
                    dp[j] = Math.min(dp[j],dp[i]+1);
                }
            }
        }
        return dp[arr.length-1];
    }
}
