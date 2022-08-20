package com.tkx.java.leecodeHot100;

import com.tkx.java.剑指offer.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月16日 9:24
 */
public class _114二叉树展开为链表 {

    //解法一
    // Map<TreeNode,TreeNode> map;
    // TreeNode pre;
    // public void flatten(TreeNode root) {
    //     map = new HashMap<>();
    //     preOrder(root);
    //     for (TreeNode treeNode : map.keySet()) {
    //         treeNode.right = map.get(treeNode);
    //         treeNode.left = null;
    //     }
    //
    // }
    //
    // public void preOrder(TreeNode node){
    //     if(node!=null){
    //         if(pre!=null) map.put(pre,node);
    //         pre = node;
    //         preOrder(node.left);
    //         preOrder(node.right);
    //     }
    // }

    //解法二
    //从后往前遍历链表
    TreeNode pre;
    public void flatten(TreeNode root) {
        if(root!=null){
            flatten(root.right);
            flatten(root.left);
            root.right =pre;
            root.left = null;
            pre = root;
        }

    }

}
