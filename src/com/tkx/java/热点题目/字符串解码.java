package com.tkx.java.热点题目;

import java.util.Stack;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月07日 8:57
 */
public class 字符串解码 {
    public static void main(String[] args) {
        String s = "3[a]2[bc]";
    }
    public  String decodeString(String s) {
        Stack<Character> stc = new Stack<>();
        Stack<Integer> stn = new Stack<>();
        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length;) {
            if (cs[i] >= '0' && cs[i] <= '9') {
                String tmp = "";
                while (cs[i] >= '0' && cs[i] <= '9') {
                    tmp += cs[i++];
                }
                stn.push(Integer.parseInt(tmp));
            } else {
                if (cs[i] == '[') {
                    stc.push(cs[i]);
                } else if (cs[i] == ']') {
                    String tmp = "";
                    while (true) {
                        char c = stc.pop();
                        if (c == '[') break;
                        tmp += c;
                    }
                    int num = stn.pop();
                    String t = tmp;
                    for (int j = 0; j < num-1; j++) {
                        tmp += t;
                    }
                    tmp = new StringBuilder(tmp).reverse().toString();
                    for (char c : tmp.toCharArray()) {
                        stc.push(c);
                    }
                } else {
                    stc.push(cs[i]);
                }
                i++;
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stc.empty()){
            sb.append(stc.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}
