package com.tkx.java.test;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月02日 19:57
 */
public class T4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String x = sc.next();
        String s = sc.next();
        int[] arr = new int[200000];
        for (int i = 0; i < x.length(); i++) {
            arr[i] = x.charAt(i)-'0';
        }
        for(char c:s.toCharArray()){
            if(c=='U'){

            }
            if(c=='L'){
                int add= 0;
                for(int i=0;i<arr.length;i++){
                    int tmp=arr[i]*2+add;
                    arr[i] = tmp%10;
                    add= tmp/10;
                }
            }
            if(c=='R'){
                int add= 1;
                for(int i=0;i<arr.length;i++){
                    int tmp=arr[i]*2+add;
                    arr[i] = tmp%10;
                    add= tmp/10;
                }
            }
        }
    }


}
