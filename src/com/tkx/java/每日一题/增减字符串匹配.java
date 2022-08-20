package com.tkx.java.每日一题;

import java.util.Arrays;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月09日 9:03
 */
public class 增减字符串匹配 {
    public static void main(String[] args) {
        String  s = "IDID";
        diStringMatch(s);
    }
    public static int[] diStringMatch(String s) {
        int min=0,max=1;
        int[] ans = new int[s.length()+1];
        char[] cs = s.toCharArray();
        for(int i=cs.length-1;i>=0;i--){
            if(cs[i]=='I'){
                ans[i]=min--;
                if(i==cs.length-1) ans[i+1]=max++;
            }else{
                ans[i]=max++;
                if(i==cs.length-1) ans[i+1]=min--;
            }
        }
        min = Math.abs(++min);
        for(int i=0;i<ans.length;i++){
            ans[i]+=min;
        }
        return ans;
    }
}
