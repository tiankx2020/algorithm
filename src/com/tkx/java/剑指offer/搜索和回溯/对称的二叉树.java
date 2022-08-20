package com.tkx.java.剑指offer.搜索和回溯;

import com.tkx.java.剑指offer.TreeNode;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月11日 21:55
 */
public class 对称的二叉树 {
    boolean f=true;
    public boolean isSymmetric(TreeNode root) {

        return (root==null) || dfs(root.left,root.right);

    }
    public boolean dfs(TreeNode node1,TreeNode node2){
        if(node1==null && node2==null) return true;
        if(node1==null || node2==null || node1.val != node2.val)  {
            return false;
        }
        return dfs(node1.left,node2.right) && dfs(node1.right,node2.left);
    }
}
