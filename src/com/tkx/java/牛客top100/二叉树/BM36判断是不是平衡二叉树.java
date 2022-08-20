package com.tkx.java.牛客top100.二叉树;

import com.tkx.java.剑指offer.TreeNode;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月19日 14:32
 */
public class BM36判断是不是平衡二叉树 {
    public boolean IsBalanced_Solution(TreeNode root) {
        int ans = getHeight(root);
        return ans!=-1;
    }

    public int getHeight(TreeNode node){
        if(node==null) return 0;
        int l = getHeight(node.left);
        if(l==-1) return -1;
        int r = getHeight(node.right);
        if(r==-1) return -1;
        if(Math.abs(l-r)>1) return -1;
        return Math.max(l,r)+1;
    }
}
