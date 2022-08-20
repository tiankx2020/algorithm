package com.tkx.java.牛客top100.二叉树;

import com.tkx.java.剑指offer.TreeNode;

import java.util.Stack;

/**
 * 思路：设置一个前驱结点：pre,利用二叉树的非递归遍历，判断pre的值是否>=node的值，如果大于直接返回false
 * 否则继续迭代，并更新pre
 */
public class BM34判断是不是二叉搜索树 {

    public boolean isValidBST(TreeNode root) {
        TreeNode pre = null;
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.empty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if(pre!=null && pre.val>=root.val) return false;
            pre = root;
            root = root.right;
        }
        return true;
    }
}
