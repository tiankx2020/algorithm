package com.tkx.java.秋招笔试题.科大讯飞;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年08月06日 19:37
 */
public class T1 {

    public int findEwordCount (String string) {
        // write code here
        int ans = 0;
        String[] split = string.split(",");
        for (String s : split) {
            System.out.println(s);
        }
        for (String s : split) {
            if(s.contains("e") ||s.contains("E")){
                ans++;
            }
        }
        return ans;
    }
}
