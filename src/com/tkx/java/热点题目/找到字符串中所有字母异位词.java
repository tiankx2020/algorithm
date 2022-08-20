package com.tkx.java.热点题目;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月11日 14:37
 */
public class 找到字符串中所有字母异位词 {
    /**
     * 滑动窗口
     * */
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new LinkedList<>();
        if(s.length()<p.length()){
            return list;
        }
        int[] cs = new int[26];
        int[] cp = new int[26];
        for (char c : p.toCharArray()) {
            cp[c-'0']++;
        }
        for(int i=0;i<p.length();i++){
            cs[s.charAt(i)-'0']++;
        }
        if(Arrays.equals(cs,cp)) list.add(0);
        for(int i=p.length();i<s.length();i++){
            char c = s.charAt(i);
            cs[s.charAt(i-p.length())]--;
            cs[c-'0']++;
            if(Arrays.equals(cs,cp)){
                list.add(i);
            }
        }
        return list;
    }

}
