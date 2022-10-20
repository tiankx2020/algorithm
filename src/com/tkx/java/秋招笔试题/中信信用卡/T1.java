package com.tkx.java.秋招笔试题.中信信用卡;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月22日 16:04
 */
public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] arr = new int[26];
        for (char c : s.toCharArray()) {
            arr[c-'a']++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=2){
                System.out.print((char)('a'+i));
            }
        }

    }
}
