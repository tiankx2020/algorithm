package com.tkx.java.leecodeHot100;

import java.util.Stack;

/**
 * 所用方法：stack
 * 思路：遍历s,如果s[i]为左括号，入栈
 * 如果s[i]为括号，stack的栈顶元素是否可以匹配，匹配则出现，否则返回false
 * 最后判断 stack是否为空
 */
public class _20有效的括号 {

    public static void main(String[] args) {
        String s = "()";
        isValid(s);
    }

    public static boolean isValid(String s) {
        // Stack<Character> stack = new Stack<>();
        // for (char c : s.toCharArray()) {
        //     if(c=='[' || c=='{' || c=='('){
        //         stack.push(c);
        //     }else{
        //         if(stack.empty()) return false;
        //         if(stack.peek()=='(' && c==')') stack.pop();
        //         else if(stack.peek()=='[' && c==']') stack.pop();
        //         else if(stack.peek()=='{' && c=='}') stack.pop();
        //         else return false;
        //     }
        // }
        // return stack.empty();

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '[' || c == '(' || c == '{') {
                stack.add(c);
            } else {
                if (stack.empty()) return false;
                char peek = stack.peek();
                if (c == '}' && peek == '{' || c == ']' && peek == '[' || c == ')' && peek == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
