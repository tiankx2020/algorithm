package com.tkx.java.牛客top100.二叉树;

import com.tkx.java.剑指offer.TreeNode;

import java.util.Stack;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月17日 23:12
 */
public class BM30二叉搜索树与双向链表 {
    public TreeNode Convert(TreeNode pRootOfTree) {
        TreeNode l = new TreeNode(-1);
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = l;
        while (!stack.empty() || pRootOfTree != null) {
            while (pRootOfTree != null) {
                stack.push(pRootOfTree);
                pRootOfTree = pRootOfTree.left;
            }
            pRootOfTree = stack.pop();
            pRootOfTree.left = pre;
            pre.right = pRootOfTree;
            pre = pRootOfTree;
            pRootOfTree = pRootOfTree.right;
        }
        //第一个结点左结点置空
        l.right.left=null;
        return l.right;
    }
}
