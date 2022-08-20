package com.tkx.java.笔试题.阿里暑期实习;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月28日 20:10
 */
public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n,t;
        m = sc.nextInt();
        n = sc.nextInt();
        t = sc.nextInt();
        char[][] cs = new char[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(cs[i],'.');
        }
        for(int k=0;k<t;k++){
            int a,b;
            char c;
            a =sc.nextInt();
            b =sc.nextInt();
            a--;
            b--;
            c = sc.next().charAt(0);
            for(int i=a-2;i<=a+2;i++){
                if(i>=0 && i<m){
                    cs[i][b]=c;
                }
            }
            for(int i=b-2;i<=b+2;i++){
                if(i>=0 && i<n){
                    cs[a][i]=c;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(cs[i][j]);
            }
            System.out.println("");
        }
    }
}
