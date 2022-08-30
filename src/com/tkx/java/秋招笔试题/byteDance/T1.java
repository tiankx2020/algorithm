package com.tkx.java.秋招笔试题.byteDance;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 */
public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][10005];
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            num[i] = m;
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] res = new int[n][2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<=10;i++){
            map.put((int)Math.pow(2,i),i);
        }
        for (int i = 0; i < n; i++) {
            int start=0,end =0;
            int maxStart = 0,maxEnd = 0;
            int max = 0;
            int tmp = 0;
            for (int j = 0; j < num[i]; j++) {
                if(arr[i][j]==0){
                    start = j+1;
                    end = j+1;
                    tmp = 1;
                }else{
                    tmp+=map.get(arr[i][j]);
                    end = j;
                }
                if(tmp>max){
                    while (arr[i][j]==1) end--;
                    max = tmp;
                    maxStart = start;
                    maxEnd = end;
                }
            }
            res[i][0] = maxStart+1;
            res[i][1] = maxEnd+1;
        }
        for(int i=0;i<res.length;i++){
            System.out.println(res[i][0]+" "+res[i][1]);
        }
    }

}
