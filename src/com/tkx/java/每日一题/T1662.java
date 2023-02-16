package com.tkx.java.每日一题;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年11月01日 9:41
 */
public class T1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder temp1 = new StringBuilder();
        StringBuilder temp2 = new StringBuilder();
        for (String s : word1) {
            temp1.append(s);
        }
        for (String s : word2) {
            temp2.append(s);
        }
        return temp1.toString().equals(temp2.toString());
    }
}
