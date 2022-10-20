package com.tkx.java.秋招笔试题.微众;

import java.util.*;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月13日 20:45
 */
public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr,(a,b)->b-a);
        List<String> list= new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(String.valueOf(arr[i]));
        }
        Collections.sort(list,(a,b)->(b+a).compareTo(a+b));
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<3;i++){
            sb.append(list.get(i));
        }
        System.out.println(sb.toString());
    }
}
