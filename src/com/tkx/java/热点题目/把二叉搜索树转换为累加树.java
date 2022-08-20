package com.tkx.java.热点题目;

import java.util.LinkedList;
import java.util.List;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月11日 15:51
 */
public class 把二叉搜索树转换为累加树 {
    int num = 0;
    public TreeNode convertBST(TreeNode root) {
        inOrder1(root);
        return root;
    }
    public void inOrder1(TreeNode treeNode){
        if(treeNode!=null){
            // inOrder1(treeNode.right);
            num+=treeNode.val;
            treeNode.val = num;
            // inOrder1(treeNode.left);
        }
    }


    static class TreeNode {
        int val;
        com.tkx.java.热点题目.TreeNode left;
        com.tkx.java.热点题目.TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, com.tkx.java.热点题目.TreeNode left, com.tkx.java.热点题目.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}


