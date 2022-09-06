package com.tkx.java.秋招笔试题.达达;

import java.util.*;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月03日 16:46
 */
public class T1 {
    static Set<Integer> set = new HashSet<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        dfs(0,arr,0);
        if(set.size()<9000) {
            System.out.println("XXX");
            return;
        }
        for(int i=1;i<10000;i++){
            if(!set.contains(i)){
                System.out.println(i);
            }
        }
    }

    public static void dfs(int index,int[] arr,int tmp){
        set.add(tmp);
        if(index>=arr.length || tmp>=10000) return;
            dfs(index,arr,tmp+arr[index]);
            dfs(index+1,arr,tmp);

    }
}
