package com.tkx.java.help.网易;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年08月20日 15:07
 */
public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] cs1 = {'r', 'e', 'd', 'e'};
        char[] cs2 = {'d', 'e', 'r', 'e'};
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int mod = 1 - str.length() % 2;
        for (int i = 0; i < str.length() - mod; i++) {
            sb1.append(cs1[i % 4]);
            sb2.append(cs2[i % 4]);
        }
        String s1 = sb1.toString();
        String s2 = sb2.toString();
        String st1 = str.substring(0, str.length() - mod);
        String st2 = str.substring(mod);
        List<Integer> res = new ArrayList<>();
        res.add(findDiff(s1,st1));
        res.add(findDiff(s1,st2));
        res.add(findDiff(s2,st1));
        res.add(findDiff(s2,st2));
        int  min = res.stream().min((a, b) -> a - b).get();
        System.out.println(min);
    }

    public static int findDiff(String s1, String s2) {
        int num = 0;
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)!=s2.charAt(i)){
                num++;
            }
        }
        return num;
    }

}
