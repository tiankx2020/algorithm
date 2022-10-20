package com.tkx.java.每日一题;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年10月20日 9:54
 */
public class T779 {
    public int kthGrammar(int n, int k) {
        char[]  cs  = {'0','1','1','0','1','0','0','1'};
        while(k<=8){
            k =(int)Math.pow(2,n-1)-k;
            n--;
        }
        return cs[k]-'1';
    }
}
