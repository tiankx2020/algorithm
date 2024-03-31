package com.tkx.java.每日一题;

/**
 * @Author tkx
 * @Date 2024 03 13
 **/
public class T2864 {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder sb = new StringBuilder();
        int count =0;
        for (char c : s.toCharArray()) {
            if(c=='1'){
                count++;
            }
        }
        for(int i=0;i<s.length();i++){
            if(i<count || i==s.length()-1){
                sb.append('1');
            }else{
                sb.append('0');
            }
        }
        return  sb.toString();
    }
}
