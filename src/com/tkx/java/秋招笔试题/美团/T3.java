package com.tkx.java.秋招笔试题.美团;

import java.util.*;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年08月20日 10:10
 */
public class T3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] p =new int[n];
        int[] score = new int[n];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < p.length; i++) {
            p[i] = sc.nextInt();
        }
        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
        }
        long res = 0;
        for(int i=0;i<score.length;i++){
            list.add(score[i]*100-score[i]*p[i]);
            res+=score[i]*p[i];
        }
        list.sort((a,b)->b-a);
        for(int i=0;i<m;i++){
            res+=list.get(i);
        }
        System.out.println(String.format("%.2f",res*1.0/100));
    }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int m = sc.nextInt();
    //     int[] p =new int[n];
    //     int[] score = new int[n];
    //     for (int i = 0; i < p.length; i++) {
    //         p[i] = sc.nextInt();
    //     }
    //     for (int i = 0; i < score.length; i++) {
    //         score[i] = sc.nextInt();
    //     }
    //     int allFuxi = 0;
    //     for (int i = 0; i < n; i++) {
    //         allFuxi = allFuxi+score[i]*100;
    //     }
    //     PriorityQueue<Integer> pq = new PriorityQueue<>();
    //     for (int i = 0; i < n; i++) {
    //         pq.offer(score[i]*(100-p[i]));
    //     }
    //     for (int i = 0; i < n-m; i++) {
    //         allFuxi = allFuxi-pq.poll();
    //     }
    //     System.out.println(String.format("%.2f",allFuxi*0.01));
    // }
}
