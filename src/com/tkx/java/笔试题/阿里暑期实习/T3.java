package com.tkx.java.笔试题.阿里暑期实习;

import java.util.*;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月28日 20:23
 */
public class T3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<n-2;i++){
            pq.add(Math.abs(arr[i]-arr[i+2]));
        }
        System.out.println(pq.size());
        pq.remove();
        pq.remove();
        int ans = 0 ;
        for(int x:pq){
            ans+=pq.poll();
        }
        System.out.println(ans);
    }

}
