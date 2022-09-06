package com.tkx.java.笔试题.游卡;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月06日 19:19
 */
public class T3 {

    public String removeDuplicates(String s, int k) {
        char[] num = new char[s.length()];
        int[] w = new int[s.length()];
        int i = 0, j= 0;
        for (char item : s.toCharArray()) {
            if (i == 0 || num[i - 1] == item) {
                if (++w[j] == k) {
                    i -= k-1; // 回退
                    w[j] = 0; // 清零
                    if (j > 0) j--; // 回退
                } else num[i++] = item; // 累加
            } else {
                // 开新
                num[i++] = item;
                w[++j]++;
            }
        }
        return new String(num).substring(0, i);
    }

}
