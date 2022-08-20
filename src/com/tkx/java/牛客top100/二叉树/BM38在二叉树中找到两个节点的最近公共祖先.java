package com.tkx.java.牛客top100.二叉树;

import com.tkx.java.剑指offer.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月19日 14:53
 */
public class BM38在二叉树中找到两个节点的最近公共祖先 {

    List<TreeNode> tmp;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        tmp = new ArrayList<>();
        List<TreeNode> list1 = new ArrayList<>();
        List<TreeNode> list2 = new ArrayList<>();
        preOrder(root, p, list1);
        preOrder(root, q, list2);
        for (TreeNode treeNode : list1) {
            System.out.print(treeNode.val+" ");
        }
        System.out.println("----------------------");
        for (TreeNode treeNode : list2) {
            System.out.print(treeNode.val+" ");
        }
        TreeNode ans = null;
        for (int i = 0; i < list1.size() && i < list2.size(); i++) {
            if (list1.get(i) == list2.get(i)) {
                ans = list1.get(i);
            } else {
                break;
            }
        }
        return ans;
    }

    public void preOrder(TreeNode node, TreeNode p, List<TreeNode> list) {
        if (node != null) {
            tmp.add(node);
            if (node == p) {
                for (TreeNode treeNode : tmp) {
                    list.add(treeNode);
                }
                return;
            }
            preOrder(node.left, p, list);
            preOrder(node.right, p, list);
            tmp.remove(tmp.size() - 1);
        }
    }
}
