package com.tkx.java.剑指offer.搜索和回溯;

import com.tkx.java.剑指offer.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月11日 22:07
 */
public class 二叉树中和为某一值的路径 {
    List<List<Integer>> ans;
    List<Integer> tmp;
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        ans = new ArrayList<>();
        tmp = new LinkedList<>();
        preOrder(root,target);
        return ans;
    }

    public void preOrder(TreeNode root,int target){
        if(root!=null){
            target-=root.val;
            tmp.add(root.val);
            if(target==0 && root.left==null && root.right==null){
                ans.add(new LinkedList<>(tmp));
            }
            preOrder(root.left,target);
            preOrder(root.right,target);
            tmp.remove(tmp.size()-1);
        }
    }
}
