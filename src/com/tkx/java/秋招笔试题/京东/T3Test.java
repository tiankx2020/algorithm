package com.tkx.java.秋招笔试题.京东;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月03日 20:46
 */
public class T3Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] cs = s.toCharArray();
        long ans = 0;
        int leftc = 0;
        int count = 0;
        int[] dp = new int[cs.length];
        for (int j = 0; j < cs.length; j++) {
            if(cs[j]==')'&&leftc>0){
                count+=2;
                leftc--;
            }else if(cs[j]=='('){
                leftc++;
            }
            dp[j]=count;
        }
        for (int i = 0; i < cs.length-1; i++) {
            ans+=dp[i];
        }
        System.out.println(ans);
    }
}
