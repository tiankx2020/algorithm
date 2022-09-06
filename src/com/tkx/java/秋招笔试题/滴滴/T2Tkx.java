package com.tkx.java.秋招笔试题.滴滴;

import javax.security.sasl.SaslClient;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月04日 20:01
 */
public class T2Tkx {
    static Map<Integer,Integer> map = new HashMap<>();
    static int[][] tp = new int[100][100];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];
        int[] t = new int[n];
        for(int i=0;i<n;i++){
            start[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            end[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            t[i] = sc.nextInt();
        }
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                tp[i][j] = i^j;
            }
        }
        for(int i=0;i<t.length;i++){
            method(start[i],end[i],t[i]);
        }
    }

    public static void method(int l,int r,int t){
        int res = 0;
        for(int i=l;i<=r;i++){
            if(map.containsKey(i)){
                if(map.get(i)==t){
                    res++;
                }
                continue;
            }
            char[] cs = String.valueOf(i).toCharArray();
            int tmp = 0;
            for (char c : cs) {
                tmp = tp[tmp][c-'0'];
            }
            if(tmp == t){
                res++;
            }
            map.put(i,tmp);
        }
        System.out.print(res+" ");
    }

    // 求x的美丽数
    public int method(int x){
        int res = 0;
        int[] nums = new int[10];
        while (x>0){
            int tmp = x%10;
            x/=10;
            nums[tmp]++;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==1){
                res^=i;
            }
        }
        return res;
    }
}
