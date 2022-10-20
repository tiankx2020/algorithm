package com.tkx.java.leecode周赛.安贤311;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月19日 16:14
 */
public class T4 {
    public int[] sumPrefixScores(String[] words) {
        int[] res = new int[words.length];
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            int score = 0;
            for (int j = 1; j <= words[i].length(); j++) {
                String s = words[i].substring(0, j);
                int tmp = 0;
                Integer integer = map.get(s);
                if(integer!=null) {
                    score+=tmp;
                    continue;
                }
                for (int k = 0; k < words.length; k++) {
                    if (words[k].indexOf(s) == 0) {
                        tmp++;
                    }
                }
                map.put(s,tmp);
                score+=tmp;
            }
            res[i] = score;
        }
        return res;
    }

}
