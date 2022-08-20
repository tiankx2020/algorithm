package com.tkx.java.热点题目;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月09日 20:59
 */
public class 最小覆盖子串 {
    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
    }
    public static String minWindow(String s, String t) {
        char[] ct = t.toCharArray();
        char[] cs = s.toCharArray();
        // if (ct.length > cs.length) return "";
        int[] snum = new int[128];
        int[] tnum = new int[128];
        for (char c : ct) {
            tnum[c]++;
        }
        String ans = "";
        for(int l=0,r=0;r<s.length();){
            snum[cs[r++]]++;
            while (judge(snum,tnum)==true){
                if(ans=="" || ans.length()>(r-l)){
                    ans = s.substring(l,r);
                }
                snum[cs[l]]--;
                l++;
            }

        }
        return ans;
    }

    public static boolean judge(int[] snum,int[] tnum){
        for(int i=0;i<snum.length;i++){
            if(snum[i]<tnum[i]) return false;
        }
        return true;
    }
}
