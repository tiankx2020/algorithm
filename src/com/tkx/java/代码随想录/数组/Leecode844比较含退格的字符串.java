package com.tkx.java.代码随想录.数组;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年08月15日 23:56
 */
public class Leecode844比较含退格的字符串 {
    // 双指针
    public boolean backspaceCompare(String s, String t) {
        int nums =0,numt=0;
        int i=s.length()-1,j=t.length()-1;
        while (i>=0 || j>=0){
            while (i>=0){
                if(s.charAt(i)=='#'){
                    i--;
                    nums++;
                }else if(nums>0){
                    i--;
                    nums--;
                }else{
                    break;
                }
            }
            while (j>=0){
                if(t.charAt(j)=='#'){
                    j--;
                    numt++;
                }else if(numt>0){
                    j--;
                    numt--;
                }else{
                    break;
                }
            }
            // 比较是否相等
            if(i>=0 && j>=0){
                if(s.charAt(i)!=t.charAt(j)){
                    return  false;
                }
            }else if(i>=0 || j>=0){ // 第三种情况，有一个已经遍历完了，另外一个还没有遍历完，肯定是不匹配的
                return false;
            }
            i--;
            j--;
        }
        return true;
    }
}
