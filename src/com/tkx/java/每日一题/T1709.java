package com.tkx.java.每日一题;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月28日 11:50
 */
public class T1709 {
    public int getKthMagicNumber(int k) {
        int[] nums = new int[k];
        nums[0] = 1;
        int a = 0, b = 0, c = 0;
        for(int i=1;i<k;i++){
            int nextA = nums[a]*3;
            int nextB = nums[b]*5;
            int nextC = nums[c]*7;
            int min  = Math.min(nextA,Math.min(nextB,nextC));
            nums[i] = min;
            if(min==nextA) a++;
            if(min==nextB) b++;
            if(min ==nextC)c++;
        }
        return nums[k-1];
    }
}
