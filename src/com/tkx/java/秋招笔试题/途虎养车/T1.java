package com.tkx.java.秋招笔试题.途虎养车;

import com.tkx.java.剑指offer.TreeNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年08月31日 19:56
 */
public class T1 {
    Set<Integer> set = new HashSet<>();
    public int numColor (TreeNode root) {
        // write code here
        preOrder(root);
        return set.size();
    }

    public void preOrder(TreeNode node){
        if(node!=null){
            set.add(node.val);
            preOrder(node.left);
            preOrder(node.right);
        }
    }
}
