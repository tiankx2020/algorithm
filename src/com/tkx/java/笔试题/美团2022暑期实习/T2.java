package com.tkx.java.笔试题.美团2022暑期实习;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int count = 1000;
        int in=-1;
        int num = 0;
        for(int i=0;i<n;i++){
            if(in==-1 || arr[i]<arr[in]){
                in = i;
                num = (count+num*arr[in])/arr[i];
                count = count%arr[i];
            }else if(in!=-1 && arr[i]>arr[in]){
                count+=(arr[i])*num;
                in = i;
                num = count/arr[i];
                count = count%arr[i];
            }
        }
        count+= arr[in]*num;
        System.out.println(count);
    }
}
