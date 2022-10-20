package com.tkx.java.每日一题;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年10月03日 10:30
 */
public class HJ1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s  = sc.nextLine();
        int res = 0 ;
        for (int length = s.length()-1; length >=0; length--) {
            if(s.charAt(length)==' '){
                break;
            }else{
                res++;
            }
        }
        System.out.println(res);
    }
}
