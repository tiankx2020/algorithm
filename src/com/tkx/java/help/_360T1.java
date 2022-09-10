package com.tkx.java.help;

import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月09日 16:36
 */
public class _360T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for(int i=1;i*i<=n;i++){
            stack.add(i);
        }
        int sum = 0;
        while (m>0 &&!stack.empty()){
            sum+=stack.pop();
        }
        System.out.println(sum);
    }
}
