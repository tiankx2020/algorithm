package com.tkx.java.剑指offer.搜索和回溯;


import com.tkx.java.剑指offer.TreeNode;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月11日 21:38
 */
public class 树的子结构 {

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return (A!=null && B!=null)
                && (recur(A,B)||isSubStructure(A.left,B)||isSubStructure(A.right,B));
    }

    public boolean recur(TreeNode A, TreeNode B){
        if(B==null) return true;
        if(A==null || A.val!=B.val) return false;
        return recur(A.left,B.left) && recur(A.right,B.right);
    }

}
