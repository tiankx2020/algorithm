package com.tkx.java.秋招笔试题.京东;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月03日 19:24
 */
public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int res =0 ;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Arrays.stream(arr).max().getAsInt();
        long count = Arrays.stream(arr).filter(a -> a < max).count();
        if(count==n){
            System.out.println(0);
        }else{
            System.out.println(count);
        }
    }
}
