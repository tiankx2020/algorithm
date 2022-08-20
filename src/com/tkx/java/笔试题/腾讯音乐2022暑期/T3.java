package com.tkx.java.笔试题.腾讯音乐2022暑期;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月27日 19:13
 */
public class T3 {
    public int howMany (String S, int k) {
        int[] arr = new int[26];
        int ans = 0;
        for (char c : S.toCharArray()) {
            arr[c-'a']++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=k) ans++;
        }
        return ans;
    }
}
