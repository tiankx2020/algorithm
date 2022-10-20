package com.tkx.java.秋招笔试题._360;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        List<String> s1 = new ArrayList<>();
        List<String> s2 = new ArrayList<>();
        List<String> s3 = new ArrayList<>();
        for (int i = 0; i < n1; i++) {
            s1.add(sc.next());
        }
        for (int i = 0; i < n2; i++) {
            s2.add(sc.next());
        }
        for (int i = 0; i < n3; i++) {
            s3.add(sc.next());
        }
        int n = sc.nextInt();
        sc.nextLine();
        String[] ss = new String[n];
        for (int i = 0; i < n; i++) {
            ss[i] = sc.nextLine();
        }
        for (int i = 0; i < ss.length; i++) {
            String[] str = ss[i].split(" ");
            List<Integer> list = new ArrayList<>();
            int num1 = 0;
            int num2 = 0;
            int num3 = 0;
            for (int k = 0; k < str.length; k++) {
                if (s1.contains(str[k])) {
                    list.add(1);
                    num1++;
                }
                if (s2.contains(str[k])) {
                    list.add(2);
                    num2++;
                }
                if (s3.contains(str[k])) {
                    list.add(3);
                    num3++;
                }
            }
            List<Integer> tmp = new ArrayList<>(list);
            if(num2!=1 ||num1<1 ){
                System.out.println("NO");
                continue;
            }
            Collections.sort(tmp);
            // boolean flag = true;
            // for(int k=0;k<tmp.size();k++){
            //     if(list.get(i)!=tmp.get(i)){
            //         flag = false;
            //         break;
            //     }
            // }
            //
            // if(flag){
            //     System.out.println("YES");
            // }else{
            //     System.out.println("NO");
            // }
            if(list.equals(tmp)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
