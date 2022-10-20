package com.tkx.java.每日一题;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年10月03日 10:33
 */
public class HJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine().toLowerCase();
        String s = sc.nextLine();
        System.out.print(str.length()-str.replaceAll(s,"").length());
    }
}
