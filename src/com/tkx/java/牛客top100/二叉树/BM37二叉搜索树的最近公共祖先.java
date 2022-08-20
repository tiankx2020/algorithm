package com.tkx.java.牛客top100.二叉树;

import com.tkx.java.剑指offer.TreeNode;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月19日 14:50
 */
public class BM37二叉搜索树的最近公共祖先 {

    public int lowestCommonAncestor (TreeNode root, int p, int q) {
        int min = Math.min(p,q);
        int max = Math.max(p,q);
        while (root!=null){
            if(root.val==min || root.val==max) return root.val;
            if(root.val<min) root = root.right;
            else root = root.left;
        }
        return -1;
    }
}
