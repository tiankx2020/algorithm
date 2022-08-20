package com.tkx.java.秋招笔试题.蔚来;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年07月27日 20:51
 */
public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int tmp = arr[0];
        long ans = tmp;
        for(int i=1;i<arr.length;i++){
            if(tmp<0){
                tmp = arr[i];
            }else{
                tmp+=arr[i];
            }
            ans = Math.max(ans,tmp);
        }
        ans = Math.max(ans,tmp);
        System.out.println(ans);
    }
}
