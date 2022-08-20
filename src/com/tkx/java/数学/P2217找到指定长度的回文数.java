package com.tkx.java.数学;

import java.util.*;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年03月29日 14:27
 */
public class P2217找到指定长度的回文数 {
    public long[] kthPalindrome(int[] queries, int intLength) {
        long[] ans = new long[queries.length];
        Arrays.fill(ans, -1);
        long l = (long) Math.pow(10, (intLength + 1) / 2 - 1) - 1;
        for(int i=0;i<queries.length;i++){
            long l1 = l + queries[i];
            if(l1<(long) Math.pow(10, (intLength + 1) / 2)){
                long tmp = l1;
                if(intLength%2==1) tmp/=10;
                while(tmp!=0){
                    l1*=10;
                    l1+=tmp%10;
                    tmp/=10;
                }
                ans[i]=l1;
            }
        }
        return ans;
    }
}
