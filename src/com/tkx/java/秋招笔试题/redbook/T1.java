package com.tkx.java.秋招笔试题.redbook;

import javax.security.sasl.SaslClient;
import java.util.*;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月04日 16:54
 */
public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        List<Integer> tmp = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            tmp.add(arr[i]);
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<=m;i++){
            list.addAll(tmp);
            tmp = new ArrayList<>(list);
            Collections.reverse(tmp);
            if(k<list.size()){
                break;
            }
        }
        System.out.println(list.get(k-1));
    }
}
