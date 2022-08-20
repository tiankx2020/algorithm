package com.tkx.java.leecodeHot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
    所用方法：双指针+排序
    具体思路：下标k一定要取的点，对[k+1,nums.length-1]区间内进行二分查找，三个数的和为sum
    如果sum>0  j向左移动，并且nums[j]不能等于原来的那个值
    如果sum<0  i向右移动，并且nums[i]不能等于原来的那个值
    sum==0  添加到List中，并且i,j都更新
    时间复杂度：O(N2)
    空间复杂度：O(N)
 */
public class _15三数之和 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int k=0;k<nums.length-2;k++){
            if(k>0 && nums[k]==nums[k-1]) continue;
            int i=k+1,j= nums.length-1;
            int tmp;
            while (i<j){
                if(nums[i]+nums[j]+nums[k]>0){
                    //从右往左找到 第一个不等于nums[j]的数
                    tmp = nums[j];
                    while (i<j && nums[j]==tmp) j--;
                }else if(nums[i]+nums[j]+nums[k]<0){
                    tmp = nums[i];
                    while (i<j && nums[i]==tmp) i++;
                }else{
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    tmp = nums[j];
                    while (i<j && nums[j]==tmp) j--;
                    tmp = nums[i];
                    while (i<j && nums[i]==tmp) i++;
                }
            }
        }
        return ans;
    }
}
