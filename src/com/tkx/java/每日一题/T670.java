package com.tkx.java.每日一题;


/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月13日 9:06
 */
public class T670 {
    public static void main(String[] args) {
        int num = 98368;
        System.out.println(maximumSwap(num));
    }
    public static int maximumSwap(int num) {
        char[] cs = String.valueOf(num).toCharArray();
        for(int i=0;i<cs.length-1;i++){
            int maxIndex = i;
            for(int j=cs.length-1;j>i;j--){
                if(cs[j]-cs[maxIndex]>0){
                    maxIndex = j;
                }
            }
            if(maxIndex!=i){
                char tmp = cs[i];
                cs[i] = cs[maxIndex];
                cs[maxIndex] = tmp;
                break;
            }
        }
        return Integer.valueOf(new String(cs));
    }
}
