package com.tkx.java.leecode模拟面试;

import java.util.LinkedList;
import java.util.List;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月14日 10:53
 */
public class T2 {
    public List<String> restoreIpAddresses(String s) {
        List<String> list = new LinkedList<>();
        for (int i = 1; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                for (int k = j + 1; k < s.length(); k++) {
                        if (judge(s.substring(0, i)) &&
                                judge(s.substring(i, j)) &&
                                judge(s.substring(j, k)) &&
                                judge(s.substring(k))
                        )
                        list.add(s.substring(0,i)+"."+s.substring(i, j)+"."+
                                s.substring(j, k)+"."+s.substring(k));

                }
            }
        }
        return list;
    }

    public boolean judge(String s) {
        if (s.length() == 0||s.length()>3) return false;
        if (s.charAt(0) == '0' && s.length() > 1) return false;
        int x = Integer.parseInt(s);
        if (x > 255) return false;
        return true;
    }
}
