package com.tkx.java.笔试题.微众银行2022暑期实习;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月20日 20:18
 */
public class T3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        char c;
        n = sc.nextInt();
        k = sc.nextInt();
        c= sc.next().charAt(0);
        String s = sc.next();
        char[] cs = s.toCharArray();
        long ans = 0 ;
        for(int len=k;len<=n;len++){
            int i=0,j=i+len-1;
            int num = 0;
            for(int t= 0;t<=j;t++){
                if(cs[t]==c) num++;
            }
            if(num==k) ans++;
            i++;
            j++;
            for(;j<n;i++,j++){
                if(cs[i-1]==c) num--;
                if(cs[j]==c) num++;
                if(num==k) ans++;
            }
        }
        System.out.println(ans);
    }
}
