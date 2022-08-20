package com.tkx.java.leecodeHot100;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月16日 14:12
 */
public class _10盛最多水的容器 {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int ans = 0;
        while (i<j){
            ans = Math.max(ans,(j-i)*Math.min(height[i],height[j]));
            if(height[i]<=height[j]) i++;
            else j--;
        }
        return ans;
    }
    /**
     * 思路：刚开始 i指向左边，j指向右边。容纳的水量L= (j-i)*Math.min(height[i],height[j]);
     * 想要使L增大，只有移动i或者j,如果移动高度较高的指针，容量L只会变小；移动高度较小的指针，容量L才有增大的可能
     * 所以每次要移动高度较低的指针
     * 所用方法：双指针 + 贪心
     * 时间复杂度O(N)
     * 空间复杂度O(1)
     */
}

