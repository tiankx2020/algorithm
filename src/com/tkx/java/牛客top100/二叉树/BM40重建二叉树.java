package com.tkx.java.牛客top100.二叉树;

import com.tkx.java.剑指offer.TreeNode;

/**
 前序遍历的第一个节点就是这颗树的根节点。
 在中序遍历中，找到这个根节点，这个根节点的左边元素就是它的左子树上的元素，这个根节点的右边元素就是它的右子树上的元素。
 把范围划分好，直到范围上只有一个元素直接生成返回即可。
 需要找到根节点在中序遍历上的下标，才能知道它的左子树上有多少个元素，右子树上有多少个元素。为了方便找到下标，可以用 Map 结构来存储 中序遍历数组上 所有元素和其下标 的对应关系。
 */
public class BM40重建二叉树 {
    public TreeNode reConstructBinaryTree(int [] pre, int [] vin) {
        return createTree(pre,0,pre.length-1,vin,0,vin.length-1);
    }

    public TreeNode createTree(int[] pre,int l1,int r1,int[] vin,int l2,int r2){
        if(l1>r1) return null;
        TreeNode root = new TreeNode(pre[l1]);
        int index=-1;
        //找到先序遍历中的第一个结点在中序遍历中的位置
        for(int i=l2;i<=r2;i++){
            if(vin[i]==pre[l1]){
                index=i;
                break;
            }
        }
        int len  = index-l2;
        root.left = createTree(pre,l1+1,l1+len,vin,l2,l2+len-1);
        root.right= createTree(pre,l1+len+1,r1,vin,l2+len+1,r2);
        return root;
    }
}
