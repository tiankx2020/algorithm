package com.tkx.java.算法思想.滑动窗口;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年08月31日 10:40
 */
public class _76最小覆盖子串 {
    public String minWindow(String s, String t) {
        String res = s;
        int[] numsT = new int[128];
        int[] numsS = new int[128];
        for (char c : t.toCharArray()) {
            numsT[c]++;
        }
        int left =0;
        for(int i=0;i<s.length();i++){
            numsS[s.charAt(i)]++;
            while (judge(numsS,numsT)){
                // 满足题目要求
                if(i-left+1<res.length()){
                    res = s.substring(left,i+1);
                }
                numsS[s.charAt(left)]--;
                left++;
            }

        }
        return res;
    }

    // 满足题目要求
    public boolean judge(int[] nums1,int[] nums2){
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]<nums2[i]) return false;
        }
        return true;
    }
}
