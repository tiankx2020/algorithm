package com.tkx.java.笔试题.金山云;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        List<String> list = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if(i==0) list.add(arr[i]);
            else{
                if(!arr[i].toLowerCase().equals(arr[i-1].toLowerCase())){
                    list.add(arr[i]);
                }
            }
        }
        System.out.print(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            System.out.print(" "+list.get(i));
        }
    }
}
