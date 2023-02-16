package com.tkx.java.每日一题;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年10月24日 14:54
 */
public class T1768 {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        while (index<Math.min(word1.length(),word2.length())*2){
            if(index%2==0){
                sb.append(word1.charAt(index/2));
            }else{
                sb.append(word2.charAt(index/2));
            }
            index++;
        }
        if(word1.length()<=word2.length()){
            sb.append(word1.substring(index));
        }else{
            sb.append(word2.substring(index));
        }
        return sb.toString();
    }
}
