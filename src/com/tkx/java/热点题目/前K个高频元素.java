package com.tkx.java.热点题目;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月06日 20:46
 */
public class 前K个高频元素 {
    public static void main(String[] args) {
        int[] nums = {5,2,5,3,5,3,1,1,3};
        int k = 2;
        前K个高频元素 o = new 前K个高频元素();
        o.topKFrequent(nums,k);
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            int i = map.getOrDefault(num, 0) + 1;
            map.put(num,i);
        }
        int[] tmp = new int[map.size()];
        int index= 0;
        for (int x : map.keySet()) {
            tmp[index++] = map.get(x);
        }
        k = k-1;
        int idx;
        int left = 0,right = tmp.length-1;
        while(true){
             idx = quickSort(tmp,left,right);
            if(idx==k) break;
            else if(idx>k){
                right = idx-1;
            }else {
                left = idx+1;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int  x : map.keySet()) {
            System.out.println(map.get(x));
            if(map.get(x)>=tmp[idx]){
                list.add(x);
            }
        }
        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = list.get(i);
        }
        return ans;
    }

    //寻找第k的元素
    public int quickSort(int[] arr,int left,int right){
        int tmp = arr[left];
        int l=left,r=right;
        while(l<r){
            while (l<r && arr[r]<=tmp) r--;
            while (l<r && arr[l]>=tmp) l++;
            int t = arr[l];
            arr[l] =arr[r];
            arr[r] =t;
        }
        arr[left] = arr[l];
        arr[l] = tmp;
        return l;
    }
}
