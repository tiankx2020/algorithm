package com.tkx.java.leecode周赛.Airwallex288;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月10日 10:32
 */
public class D1 {
    public int largestInteger(int num) {
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();
        int tmp = num;
        while (num != 0) {
            int mod = num % 10;
            num /= 10;
            if (mod % 2 == 1) {
                list1.add(mod);
            } else {
                list2.add(mod);
            }
        }
        Collections.sort(list1, (a, b) -> b - a);
        Collections.sort(list2, (a, b) -> b - a);
        StringBuilder sb = new StringBuilder();
        String s = "" + tmp;
        int index1 = 0;
        int index2 = 0;
        for (char c : s.toCharArray()) {
            if ((c - '0') % 2 == 1) {
                sb.append(list1.get(index1++));
            } else {
                sb.append(list2.get(index2++));
            }
        }
        return Integer.valueOf(sb.toString());
    }

    public int largestInteger2(int num) {
        String s = ""+num;
        List<Character> list1 = new LinkedList<>();
        List<Character> list2 = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if((c-'0')%2==1){
                list1.add(c);
            }else{
                list2.add(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        Collections.sort(list1,(a,b)->b-a);
        Collections.sort(list2,(a,b)->b-a);
        int index1=0,index2=0;
        for (char c : s.toCharArray()) {
            if((c-'0')%2==1){
                sb.append(list1.get(index1++));
            }else{
                sb.append(list2.get(index2++));
            }
        }
        return Integer.valueOf(sb.toString());
    }

}
