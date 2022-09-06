package com.tkx.java.秋招笔试题.达达;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月03日 16:35
 */
public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(",");
        int[] task = new int[s.length];
        int k = sc.nextInt();
        for(int i=0;i<task.length;i++){
            task[i] = Integer.valueOf(s[i]);
        }
    }
}
