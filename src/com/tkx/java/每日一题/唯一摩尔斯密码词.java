package com.tkx.java.每日一题;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月10日 9:58
 */
// 简单模拟
public class 唯一摩尔斯密码词 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] arr =  {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : word.toCharArray()) {
                sb.append(arr[c-'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
