package com.tkx.java.秋招笔试题.腾讯云智;

import com.tkx.java.TreeNode;

import java.util.Stack;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年11月02日 20:03
 */
public class T1 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        inorder(root);
    }

    public static void inorder(TreeNode treeNode){
        Stack<TreeNode> stack  = new Stack<>();
        while (!stack.empty() || treeNode!=null){
            // 左子树存在的话，一直往左走
            while (treeNode!=null){
                stack.push(treeNode);
                treeNode = treeNode.left;
            }
            // 输出节点
            TreeNode tmp = stack.pop();
            System.out.println(tmp.val);
            // 向右走
            if(tmp.right!=null){
                treeNode = tmp.right;
            }
        }
    }
}
