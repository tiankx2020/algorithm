package com.tkx.java.牛客top100.二叉树;

import com.tkx.java.剑指offer.TreeNode;

/**
 * 思路:利用后序遍历交换左右孩子结点
 */
public class BM33二叉树的镜像 {
    public TreeNode Mirror (TreeNode pRoot) {
        postOrder(pRoot);
        return  pRoot;
    }

    public void postOrder(TreeNode node){
        if(node!=null){
            postOrder(node.left);
            postOrder(node.right);
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;
        }
    }
}
