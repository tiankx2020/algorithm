package com.tkx.java.每日一题;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月07日 8:37
 */
public class 旋转字符串 {
    /**
     * 简单
     */
    public boolean rotateString(String s, String goal) {
        return s.length()==goal.length() && (s+s).contains(goal);
    }
}
