package com.tkx.java.牛客top100.二叉树;

import com.tkx.java.剑指offer.TreeNode;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月17日 22:59
 */
public class BM28二叉树的最大深度 {
    public int maxDepth (TreeNode root) {
        // write code here
        if(root==null) return 0;
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        return 1+Math.max(l,r);
    }
}
