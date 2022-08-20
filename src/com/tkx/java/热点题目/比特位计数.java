package com.tkx.java.热点题目;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月06日 20:38
 */
public class 比特位计数 {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i=0;i<=n;i++){
            ans[i] = Integer.bitCount(i);
        }
        return ans;
    }
}
