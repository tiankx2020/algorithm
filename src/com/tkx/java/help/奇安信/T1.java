package com.tkx.java.help.奇安信;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月15日 20:13
 */
public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String[] s1 = str1.split(",");
        String[] s2 = str2.split(",");
        int[] arr1 = new int[s1.length];
        int[] arr2 = new int[s2.length];
        for (int i = 0; i < s1.length; i++) {
            arr1[i] = Integer.valueOf(s1[i]);
        }
        for(int i=0;i<s2.length;i++){
            arr2[i] = Integer.valueOf(s2[i]);
        }
        int[] num = new int[arr1.length];
        for(int i=0;i< arr1.length;i++){
            num[i]  = arr1[i]*10/6;
        }
    }
}
