package com.tkx.java.每日一题;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月22日 12:20
 */
public class 字母在字符串中的百分比 {
    public int percentageLetter(String s, char letter) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if(c==letter) count++;
        }
        return count*100/s.length();
    }
}
