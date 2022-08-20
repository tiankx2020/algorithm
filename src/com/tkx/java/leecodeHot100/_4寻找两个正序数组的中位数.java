package com.tkx.java.leecodeHot100;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月16日 11:05
 */
public class _4寻找两个正序数组的中位数 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int left = (m+n+1)/2;
        int right = (m+n+2)/2;
        return (getKth(nums1,0,m-1,nums2,0,n-1,left)+
                getKth(nums1,0,m-1,nums2,0,n-1,right))/2.0;
    }

    public int getKth(int[] nums1,int l1,int r1,int[] nums2,int l2,int r2,int k){
        //计算区间内的长度
        int len1 = r1-l1+1;
        int len2 = r2-l2+1;
        //某个数组用完了，直接返回另外一个数组的start+k-1的下标值
        if(len1==0) return nums2[l2+k-1];
        if(len2==0) return nums1[l1+k-1];
        if(k==1) return Math.min(nums1[l1],nums2[l2]);
        //找到 start+k/2-1的值
        int i =l1+Math.min(len1,k/2)-1;
        int j =l2+Math.min(len2,k/2)-1;
        if(nums1[i]<nums2[j]){
            return getKth(nums1,i+1,r1,nums2,l2,r2,k-(i-l1+1));
        }else{
            return getKth(nums1,l1,r1,nums2,j+1,r2,k-(j-l2+1));
        }
    }
}
