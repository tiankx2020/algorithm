package com.tkx.java.牛客top100.二叉树;

import com.tkx.java.剑指offer.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月17日 22:22
 */
public class BM23二叉树的前序遍历 {
    public int[] preorderTraversal (TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.empty() || root!=null){
            while (root!=null){
                list.add(root.val);
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            root = root.right;
        }
        int[] ans = new int[list.size()];
        for(int i=0;i<ans.length;i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}
