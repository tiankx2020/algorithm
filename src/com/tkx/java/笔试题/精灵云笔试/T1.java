package com.tkx.java.笔试题.精灵云笔试;

import java.util.Scanner;

/**
 解题思路：
  1.首先使用split函数将每句话保存在ss数组中
  2.反转ss中每个单词顺序
  3.输出每句话
 */
public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] ss = s.split("\\.");
        for(int i=0;i<ss.length;i++){
            reverse(ss[i]);
        }
    }
    public static void reverse(String s){
        String[] ss = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=ss.length-1;i>=0;i--){
            sb.append(ss[i]);
            if(i!=0) sb.append(" ");
        }
        sb.append(".");
        System.out.print(sb.toString());
    }
}
