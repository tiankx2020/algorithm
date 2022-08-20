package com.tkx.java.leecodeHot100;

import java.util.ArrayList;
import java.util.List;

/**
 * 所用方法：dfs+回溯
 * 思想：使用s数组计算每个数字可能会取代的情况，
 * 取值后向后遍历，如果index==digits.length说明已经取完了，将结果保存到list中去
 *
 * 回溯思想:每个数字都对应着多种可能，当一种可能取往后，需要恢复到未取的状态
 */
public class _17电话号码组合 {
    String[] s= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    StringBuilder sb;
    List<String> list;
    public List<String> letterCombinations(String digits) {
        sb = new StringBuilder();
        list = new ArrayList<>();
        if(digits.length()==0) return list;
        dfs(digits,0);
        return list;
    }

    public void dfs(String digits,int index){
        if(index==digits.length()){
            list.add(sb.toString());
            return;
        }
        char[] cs = s[digits.charAt(index)-'0'].toCharArray();
        for (char c : cs) {
            sb.append(c);
            dfs(digits,index+1);
            //回溯
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
