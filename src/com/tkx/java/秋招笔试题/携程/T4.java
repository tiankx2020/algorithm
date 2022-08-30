package com.tkx.java.秋招笔试题.携程;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年08月30日 19:29
 */
public class T4 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        PriorityQueue<Integer> queue  = new PriorityQueue<>((a,b)->b-a);
        for(int i=1;i<n;i++){
            queue.add(Math.abs(arr[i]-arr[i-1]));
        }
        queue.poll();
        Integer res = queue.poll();
        System.out.println(res);
    }
}
