package com.tkx.java.leecode周赛.D289;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月17日 10:30
 */
public class T1 {
    public String digitSum(String s, int k) {
        while (s.length()>k){
            StringBuilder  sb = new StringBuilder();
            int count = 0;
            for(int i=0;i<s.length();i++){
                count+= (s.charAt(i)-'0');
                if((i+1)%k==0 || i==s.length()-1){
                    sb.append(count);
                    count=0;
                }
            }
            s = sb.toString();
        }
        return s;
    }
}
