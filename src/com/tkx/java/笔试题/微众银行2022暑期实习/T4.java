package com.tkx.java.笔试题.微众银行2022暑期实习;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月20日 20:49
 */
public class T4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str = new char[100005];
        int n,k;
        char c;
        n = sc.nextInt();
        k = sc.nextInt();
        c= sc.next().charAt(0);
        String s = sc.next();
        char[] cs = s.toCharArray();
        long ans = 0 ;
        for(int len=k;len<=n;len++){
            int num = 0;
            Queue<Character> q = new LinkedList<>();
            for(int i=0;i<len;i++){
                if(cs[i]==c) num++;
                q.add(cs[i]);
            }
            if(num==k) ans++;
            for(int i=len;i<n;i++){
                if(cs[i]==c) num++;
                q.add(cs[i]);
                if(q.poll()==c) num--;
                if(num==k) ans++;
            }
        }
        System.out.println(ans);
    }
}
