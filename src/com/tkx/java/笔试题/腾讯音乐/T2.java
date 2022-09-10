package com.tkx.java.笔试题.腾讯音乐;

import com.tkx.java.剑指offer.TreeNode;

import java.util.ArrayList;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月08日 19:04
 */
public class T2 {

    ArrayList<TreeNode> res;

    public ArrayList<TreeNode> getBinaryTrees(ArrayList<Integer> preOrder, ArrayList<Integer> inOrder) {
        // write code here
        res = new ArrayList<>();
        int[] preArr = new int[preOrder.size()];
        int[] inArr = new int[inOrder.size()];
        for (int i = 0; i < preOrder.size(); i++) {
            preArr[i] = preOrder.get(i);
            inArr[i] = inOrder.get(i);
        }
        return res;
    }

    public TreeNode buildTree(int[] preorder, int l1, int r1, int[] inorder, int l2, int r2) {
        if (l1 > r1) return null;
        TreeNode node = new TreeNode(preorder[l1]);
        int index = -1;
        for (index = l2; index <= r2; index++) {
            if (inorder[index] == preorder[l1]) {
                break;
            }
        }
        int len = index - l2;
        node.left = buildTree(preorder, l1 + 1, l1 + len, inorder, l2, index - 1);
        node.right = buildTree(preorder, l1 + 1 + len, r1, inorder, index + 1, r2);
        return node;
    }
}
