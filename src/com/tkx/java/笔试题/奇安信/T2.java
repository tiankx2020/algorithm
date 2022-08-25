package com.tkx.java.笔试题.奇安信;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年08月25日 19:45
 */
public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.substring(1,str.length()-1);
        String[] ss = str.split(",");
        int[] arr = new int[ss.length];
        for (int i = 0; i < ss.length; i++) {
            arr[i]  = Integer.valueOf(ss[i]);
        }
        int res = 0;
        int i=0,j=arr[arr.length-1];
        while (i<j){
            res = Math.max(res,(j-i)*Math.min(arr[i],arr[j]));
            if(arr[i]<arr[j]){
                i++;
            }else{
                j--;
            }
        }
        System.out.println(res);
    }
}
