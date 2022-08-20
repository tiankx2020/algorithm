package com.tkx.java.秋招笔试题.zoom;

import java.util.*;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年08月10日 19:49
 */
public class T1 {
    public static void main(String[] args) {
        int res = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] color = new char[n];
        int[] redNum = new int[n];
        int[] greenNum = new int[n];
        String colors = sc.next();
        for (int i = 0; i < colors.length(); i++) {
            color[i] = colors.charAt(i);
            if(color[i]=='R'){
                redNum[i]++;
            }else{
                greenNum[i]++;
            }
        }
        int[][] arr = new int[n-1][2];
        for(int i=0;i<n-1;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        Set<Integer> set = new HashSet<>();
        set.add(1);
        while (!queue.isEmpty()){
            Integer parent = queue.poll();
            for (int i = 0; i < n - 1; i++) {
                if(arr[i][0]==parent &&!set.contains(arr[i][1])){
                    int child = arr[i][1];
                    redNum[child-1]+=redNum[parent-1];
                    greenNum[child-1]+=greenNum[parent-1];
                    queue.add(child);
                    set.add(arr[i][1]);
                }
                if(arr[i][1]==parent&&!set.contains(arr[i][0])){
                    int child = arr[i][0];
                    redNum[child-1]+=redNum[parent-1];
                    greenNum[child-1]+=greenNum[parent-1];
                    queue.add(child);
                    set.add(arr[i][0]);
                }
            }
        }
        for(int i=0;i<n;i++){
            res+=Math.abs(redNum[i]-greenNum[i]);
        }
        System.out.println(res);
    }
}

