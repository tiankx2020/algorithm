package com.tkx.java.每日一题;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年10月30日 13:28
 */
public class T784 {
    public static void main(String[] args) {
        System.out.println('a'-'A');
    }
    List<String> res = new ArrayList<>();
    public List<String> letterCasePermutation(String s) {
        char[] cs = s.toLowerCase().toCharArray();
        dfs(cs,0);
        return res;
    }

    public void dfs(char[] cs,int index){
        if(index==cs.length){
            res.add(new StringBuilder().append(cs).toString());
            return;
        }
        // 如果是数字的话，直接下一步
        if(cs[index]>='0' && cs[index]<='9'){
            dfs(cs,index+1);
        }else{
            // 如果是字母就考虑两种情况
            char tmp = cs[index];
            if(cs[index]>='a' && cs[index]<='z'){
                cs[index] = (char)(cs[index]-32);
            }else{
                cs[index] = (char)(cs[index]-32);
            }
            dfs(cs,index+1);
            cs[index] = tmp;
            dfs(cs,index+1);
        }
    }
}
