package com.tkx.java.test;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月16日 22:20
 */
public class 最长单词 {
    public String longestWord(String[] words) {
        String ans = "";
        boolean[][] dp = new boolean[words.length][101];
        for(int i=0;i<words.length;i++){
            dp[i][0] = true;
        }
        Set<String> set = new HashSet<>();
        for (String word : words) {
            set.add(word);
        }
        for(int i=0;i<words.length;i++){
            for(int j=1;j<=words[i].length();j++){
                for(int k=0;k<j;k++){
                    String tmp = words[i].substring(k,j);
                    if(set.contains(tmp)&&(k!=0||j!=words[i].length())){
                        dp[i][j]|=dp[i][k];
                    }
                }
            }
        }
        for(int i=0;i<words.length;i++){
            // System.out.println(dp[i][words[i].length()]);
            if(dp[i][words[i].length()]==true){
                if(words[i].length()>ans.length()){
                    ans = words[i];
                }else if(words[i].length() == ans.length() && words[i].compareTo(ans)<0){
                    ans = words[i];
                }
            }
        }
        return ans;
    }
}
