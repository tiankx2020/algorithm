package com.tkx.java.滑动窗口;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年03月29日 13:47
 */
public class p2024考试的最大困扰度 {

    public int maxConsecutiveAnswers(String answerKey, int k) {
        char[] cs = answerKey.toCharArray();
        return Math.max(maxConsecutiveAnswers(cs,k,'T'),maxConsecutiveAnswers(cs,k,'F'));
    }

    public int maxConsecutiveAnswers(char[] cs ,int k ,char c){
        int num = 0;
        int start=0,end=0;
        int max = 0;
        for(;end<cs.length;end++){
            if(cs[end]==c){
                num++;
            }
            if(num>k){
                //找到第一个c的下标
                while(cs[start]!=c) start++;
                start++;
                num--;
            }
            max = Math.max(max,end-start+1);
        }
        return max;
    }
}
