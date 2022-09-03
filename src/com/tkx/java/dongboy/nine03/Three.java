package com.tkx.java.dongboy.nine03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author dong boy
 * @date 2022年09月03日 16:51
 */
public class Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int start = Integer.parseInt(input.split(",")[0]);
        int end = Integer.parseInt(input.split(",")[1]);
        List<Integer> res = new ArrayList<>();
        for(int i = start; i <= end; i++){
            if(i > 10){
                if(isNumber(i)){
                    res.add(i);
                }
            }
        }
        for(int i = 0; i < res.size(); i++){
            if(i == res.size() - 1){
                System.out.print(res.get(i));
            } else {
                System.out.print(res.get(i) + ",");
            }
        }
    }

    private static boolean isNumber(int num) {
        String s = String.valueOf(num);
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return s.equals(sb.toString());
    }
}
