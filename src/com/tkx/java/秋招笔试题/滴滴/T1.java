package com.tkx.java.秋招笔试题.滴滴;

import java.util.*;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月04日 19:26
 */
public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int res = 1;
        Integer[] arr= new Integer[n];
        long[] sum = new long[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr,(a,b)->b-a);
        sum[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            sum[i]=sum[i-1]+arr[i];
        }
        long count = 0;

        for(int i=0,j=0;j<arr.length;j++){
            count+=arr[j];
            if((arr[i]/(count*1.0/(j-i+1)))<=k){
                res = Math.max(res,j-i+1);
            }else{
                count-=arr[i];
                i++;
            }
        }
        System.out.println(res);
    }
}
