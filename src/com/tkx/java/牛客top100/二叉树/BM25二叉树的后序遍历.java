package com.tkx.java.牛客top100.二叉树;

import com.tkx.java.剑指offer.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月17日 22:39
 */
public class BM25二叉树的后序遍历 {
    public int[] postorderTraversal (TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.empty() || root!=null){
            while (root!=null){
                list.add(root.val);
                stack.push(root);
                root = root.right;
            }
            root = stack.pop();
            root = root.left;
        }
        int[] ans = new int[list.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i-ans.length+1] = list.get(i);
        }
        return ans;
    }
}
