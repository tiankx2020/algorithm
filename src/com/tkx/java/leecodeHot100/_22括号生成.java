package com.tkx.java.leecodeHot100;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 所用方法：dfs+回溯
 * 核心思想：在添加一个元素的时候，有两种可能 '(',')'
 * 因为两种情况不能相互干扰，所以需要进行回溯
 * 当i = n*2时，判断是否是满足条件的情况，满足条件时，就添加
 * 最后返回list
 */
public class _22括号生成 {
    List<String> list;
    StringBuilder sb;
    public List<String> generateParenthesis(int n) {
        list = new ArrayList<>();
        sb = new StringBuilder();
        dfs(n,0);
        return list;
    }

    public void dfs(int n, int index) {
        if (n * 2 == index) {
            if(judge(sb.toString())){
                list.add(sb.toString());
            }
            return;
        }
        sb.append('(');
        dfs(n, index + 1);
        sb.deleteCharAt(sb.length() - 1);

        sb.append(')');
        dfs(n, index + 1);
        sb.deleteCharAt(sb.length() - 1);
    }

    public boolean judge(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.empty()) return false;
                stack.pop();
            }
        }
        return stack.empty();
    }
}
