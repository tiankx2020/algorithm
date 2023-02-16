package com.tkx.java.秋招笔试题.斑马网络;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2023年01月08日 11:50
 */
public class T2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] cs = s.split(",");
        String version1 = cs[0].substring(cs[0].indexOf('"')+1,cs[0].lastIndexOf('"'));
        String version2 = cs[1].substring(cs[1].indexOf('"')+1,cs[1].lastIndexOf('"'));
        System.out.println(compare(version1,version2));
    }

    public static int compare(String version1, String version2) {
        // 转移字符
        String[] cs1 = version1.split("\\.");
        String[] cs2 = version2.split("\\.");
        int i = 0, j = 0;
        // 两者有位数的时候进行比较
        while (i < cs1.length && j < cs2.length) {
            int i1 = Integer.parseInt(cs1[i]);
            int i2 = Integer.parseInt(cs2[j]);
            if (i1 > i2) return 1;
            if (i1 < i2) return -1;
            i++;
            j++;
        }
        // 判断后面是否有非0的数
        while (i<cs1.length){
            int i1 = Integer.parseInt(cs1[i]);
            if(i1>0) return 1;
            // 后移
            i++;
        }
        while (j<cs2.length){
            int i2 = Integer.parseInt(cs2[j]);
            if(i2>0) return -1;
            // 后移
            j++;
        }
        return 0;
    }
}
