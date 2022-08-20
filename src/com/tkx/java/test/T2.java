package com.tkx.java.test;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月02日 16:15
 */
public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int  a, b, c, d;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();
            int ans = 0;
            int v1 = Math.min(a,c);
            a-=v1;
            c-=v1;
            ans+=v1;
            int v2 = b/2;
            b = b%2;
            ans+=v2;
            int v3 = Math.min(a/2,b);
            a = a-v3*2;
            ans+=v3;
            int v4 = a/4;
            ans+=v4;
            ans+=d;
            System.out.println(ans);
        }

    }
}
