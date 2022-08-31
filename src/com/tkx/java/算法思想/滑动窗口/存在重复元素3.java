package com.tkx.java.算法思想.滑动窗口;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月03日 21:19
 */
public class 存在重复元素3 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        for(int i=1;i<nums.length;i++){
            for(int j=Math.max(0,i-k);j<i;j++){
                if(Math.abs(nums[i]-nums[j])<=t && Math.abs(i-j)<=k){
                    return true;
                }
            }
        }
        return  false;
    }
}
