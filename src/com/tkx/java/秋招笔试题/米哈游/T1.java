package com.tkx.java.秋招笔试题.米哈游;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月14日 20:58
 */
public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 记录奇数的集合
        List<Integer> l1 = new ArrayList<>();
        // 记录偶数的集合
        List<Integer> l2 = new ArrayList<>();
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            if(a%2==0){
                l2.add(a);
            }else{
                l1.add(a);
            }
        }
        int index =0;
        // 将两者分开放
        while (index<l1.size() && index<l2.size()){
            // 并且数量较多的先放
            if(l1.size()>l2.size()){
                System.out.print(l1.get(index)+" ");
                System.out.print(l2.get(index)+" ");
            }else{
                System.out.print(l2.get(index)+" ");
                System.out.print(l1.get(index)+" ");
            }

            index++;
        }
        while (index<l1.size()){
            System.out.print(l1.get(index)+" ");
            index++;
        }
        while (index<l2.size()){
            System.out.print(l2.get(index)+" ");
            index++;
        }
    }
}
