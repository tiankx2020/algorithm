package com.tkx.java.秋招笔试题.神策数据;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年08月19日 20:37
 */
public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        for(int i=0;i<n;i++){
            String str = sc.next();
            String[] ss = str.split("\\.");
            int count = 2*2*2*2*2*2*2*2;
            long res = 0;
            for(int j=0;j<ss.length;j++){
                if(ss[j].equals("")){
                    ss[j]="0";
                }
                if(ss[j].contains("!")||ss[j].contains("@")){
                    res = -1;
                    break;
                }
                if(Integer.valueOf(ss[j])<0 || Integer.valueOf(ss[j])>255){
                    res = -1;
                    break;
                }
                if(j==0 && (Integer.valueOf(ss[j])==0|| ss[j].equals(""))){
                    res = -1;
                    break;
                }
                res+=Integer.valueOf(ss[j])*count;
                count*=7;
            }
            System.out.println(res);
        }
    }
}
