package com.tkx.java.每日一题;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年10月11日 10:56
 */
public class T1790 {
    public static void main(String[] args) {
        String s1 = "bank";
        String s2 = "kanb";
        areAlmostEqual(s1,s2);

    }
    public static boolean areAlmostEqual(String s1, String s2) {
        char[] cs1 = s1.toCharArray();
        char[] cs2 = s2.toCharArray();
        int index1=-1,index2=-1;
        for(int i=0;i<cs1.length;i++){
            if(cs1[i]!=cs2[i]){
                if(index1==-1){
                    index1=i;
                }else if(index2==-1){
                    index2=i;
                }else{
                    return false;
                }
            }
        }
        if(index1==-1) return true;
        if(index2==-1) return false;
        return cs1[index1]==cs2[index2] && cs1[index2]==cs2[index1];
    }

}
