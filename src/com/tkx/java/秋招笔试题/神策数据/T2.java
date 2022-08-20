package com.tkx.java.秋招笔试题.神策数据;

import java.util.*;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年08月19日 19:29
 */
public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[][] arr = new int[count][2];
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,0);
        for(int i=0;i<arr.length;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            map.put(arr[i][0],arr[i][1]);
        }
        int m = sc.nextInt();
        int n = sc.nextInt();
        List<Integer> l1 = new LinkedList<>();
        List<Integer> l2 = new LinkedList<>();
        while (m!=0){
            l1.add(m);
            m = map.getOrDefault(m,-1);
        }
        while (n!=0){
            l2.add(n);
            n = map.getOrDefault(n,-1);
        }
        while (l1.size()!=l2.size() || l1.get(0)!=l2.get(0)){
            if(l1.size()>l2.size()){
                l1.remove(0);
            }else if(l1.size()<l2.size()){
                l2.remove(0);
            }else{
                l1.remove(0);
                l2.remove(0);
            }
        }
        if(l1==null){
            System.out.println(0);
        }else{
            System.out.println(l1.get(0));
        }

    }
}
