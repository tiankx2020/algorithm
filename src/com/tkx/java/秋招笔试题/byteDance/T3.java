package com.tkx.java.秋招笔试题.字节跳动;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年08月28日 10:34
 */
public class T3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] arr = new int[n];
       for(int i=0;i<arr.length;i++){
           arr[i] = sc.nextInt();
       }
       int res = 0;
       for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               sawpArr(arr,i,j);
               int tmp = maxSubArray(arr);
               sawpArr(arr,i,j);
               res = Math.max(res,tmp);
           }
       }
        System.out.println(res);
    }
    public static void sawpArr(int[] arr,int i,int j){
        while (i<j){
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
    }
    public static int maxSubArray(int[] nums){
        int ans  = nums[0];
        int num = nums[0];
        for(int i=0;i<nums.length;i++){
            num = Math.max(nums[i],num+nums[i]);
            ans  = Math.max(ans,num);
        }
        return  ans;
    }
}
