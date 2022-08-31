package com.tkx.java.leecodeHot100;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/**
   所用方法：利用start记录字符串的开始下标的前一个节点
            end方法记录字符串的结束下标
    每次加入end的时候判断字符串中是否穿在s[end],调用map得到i
        如果i<=start 说明不存在
        如果i>start  说明存在，
        i = Math.max(i,start) //关键
        ans = Math.max(ans,end-start)

    return ans;
 * @date: 2022年05月16日 9:45
 */
public class _3无重复字符的最长子串 {

    public static void main(String[] args) {
        String s = "abcabcbb";
        lengthOfLongestSubstring(s);
    }
    //第二种解法，滑动窗口

    /**
     * 什么时候进行滑动呢
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        Map<Character,Integer> map = new HashMap<>();
        int max = 0;
        int left =0;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                left =Math.max(left,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
        }
        return max;

    }


}
