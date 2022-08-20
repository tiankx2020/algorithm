package com.tkx.java.剑指offer;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月11日 19:38
 */
public class 左旋转字符串 {
    public String reverseLeftWords(String s, int n) {
        int len = s.length();
        s+=s;
        return  s.substring(n,n+len);
    }
}
