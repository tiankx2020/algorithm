package com.tkx.java.秋招笔试题.金山云;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年11月08日 20:42
 */
public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(list.isEmpty()){
                list.add(arr[i]);
            }else{
                String tmp = list.get(list.size() - 1).toLowerCase();
                if(!tmp.equals(arr[i].toLowerCase())){
                    list.add(arr[i]);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            if(i!=list.size()-1){
                System.out.print(" ");
            }
        }
    }
}
