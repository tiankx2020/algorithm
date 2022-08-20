package com.tkx.java.热点题目;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月10日 22:07
 */
public class 接雨水 {
    public int trap(int[] height) {
        int[] left= new int[height.length];
        int[] right = new int[height.length];
        for(int i=0;i<height.length;i++){
            left[i] = height[i];
            if(i!=0) left[i] = Math.max(left[i-1],left[i]);
        }

        for(int i=height.length-1;i>=0;i--){
            right[i] = height[i];
            if(i!=height.length-1) right[i] = Math.max(right[i+1],right[i]);
        }
        int ans = 0;
        for(int i=1;i<height.length-1;i++){
            ans+=(Math.min(left[i],right[i])-height[i]);
        }
        return ans;
    }
}
