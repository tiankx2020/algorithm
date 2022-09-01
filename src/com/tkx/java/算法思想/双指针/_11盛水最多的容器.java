package com.tkx.java.算法思想.双指针;

/**
 * 双指针
 */
public class _11盛水最多的容器 {
    public int maxArea(int[] height) {
        int res = 0;
        int i = 0, j = height.length-1;
        while (i<j){
            res = Math.max(res,(j-i)*Math.min(height[i],height[j]));
            if(height[i]<height[j]) i++;
            else j++;
        }
        return res;
    }
}
