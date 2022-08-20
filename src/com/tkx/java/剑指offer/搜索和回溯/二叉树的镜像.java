package com.tkx.java.剑指offer.搜索和回溯;

import com.tkx.java.剑指offer.TreeNode;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月11日 21:53
 */
public class 二叉树的镜像 {
    public TreeNode mirrorTree(TreeNode root) {
        postOrder(root);
        return root;
    }
    public void postOrder(TreeNode root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            TreeNode tmp = root.left;
            root.left = root.right;
            root.right = tmp;
        }
    }
}
