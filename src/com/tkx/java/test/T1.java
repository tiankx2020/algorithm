package com.tkx.java.test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月02日 16:05
 */
public class T1 {
    public static void main(String[] args) {
    }

    /**
     *  大致步骤为 使用两个栈 stack_multi,stack_res 一个用来保存数量，一个用来保存要字符串
     *  两个变量 multi,res 用来保存数量和字符串
     *  当碰到 ‘[’时，将当前数量multi和字符串加入到各自的栈中
     *  当碰到‘]’ ,说明要出栈了，取出两个栈中元素连接 并 加入到stack_res的最后一个元素中
     *  返回最后以此计算的值
     *
     *
     */
    public  String decodeString(String s) {
        StringBuilder res = new StringBuilder();
        int multi = 0;
        Stack<Integer> st_multi = new Stack<>();
        Stack<String> st_res = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '[') {
                st_multi.push(multi);
                multi = 0;
                st_res.push(res.toString());
                res = new StringBuilder();
            } else if (c == ']') {
                int num = st_multi.pop();
                String t = st_res.pop();
                StringBuilder  sb = new StringBuilder();
                sb.append(t);
                for (int i = 0; i < num; i++) {
                    sb.append(res);
                }
                res = new StringBuilder(sb.toString());
            } else if (c >= '0' && c <= '9') {
                multi = multi * 10 + (c - '0');
            } else {
                res.append(c);
            }
        }

        return res.toString();
    }
}
