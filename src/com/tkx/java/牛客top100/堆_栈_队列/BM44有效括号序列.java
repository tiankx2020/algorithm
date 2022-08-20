package com.tkx.java.牛客top100.堆_栈_队列;

import java.util.HashSet;
import java.util.Stack;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月19日 19:09
 */
public class BM44有效括号序列 {
    public boolean isValid (String s) {
        char[] cs = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        set.add('(');
        set.add('[');
        set.add('{');
        Stack<Character> stack = new Stack<>();
        for (char c : cs) {
            if(set.contains(c)){
                stack.push(c);
            }else{
                if(!stack.empty()){
                    if(c==']' && stack.peek()=='[' || c==')' && stack.peek()=='(' ||c=='}' && stack.peek()=='{'){
                        stack.pop();
                    }
                }
            }
        }
        return stack.empty();
    }
}
