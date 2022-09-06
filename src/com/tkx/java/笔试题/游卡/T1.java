package com.tkx.java.笔试题.游卡;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月06日 19:01
 */
public class T1 {
    public static void main(String[] args) {

    }

    public String alternativeMerge2 (String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        int len1 = str1.length();
        int len2 = str2.length();
        int index =0;
        while (index<len1){
            sb.append(str1.charAt(index%len1));
            sb.append(str2.charAt(index%len2));
            index++;
        }
        return sb.toString();// write code here
    }
}
