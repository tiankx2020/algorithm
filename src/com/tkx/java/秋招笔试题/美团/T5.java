package com.tkx.java.秋招笔试题.美团;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年08月20日 11:33
 */
public class T5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<b.length;i++){
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int res = 0;
        for(int i=0;i<a.length;i++){
            int target = a[i];
            int index = binary(b,target);
            if(index==-1){
                System.out.println(-1);
                return;
            }
            res+=b[index];
        }
        System.out.println(res);
    }

    public  static int binary(int[] arr,int target){
        int l = -1,r=arr.length;
        while (l+1!=r){
            int mid = (l+r)/2;
            if(arr[mid]<target){
                l=mid;
            }else{
                r=mid;
            }
        }
        if(r==arr.length) return -1;
        return r;
    }
}
