package com.zhb.simple.from51to100;

import com.zhb.mylocallib.TreeNode;

/**
 * @author zhb
 * @create 2022-03-24 7:28
 */
public class Problem_100_IsSameTree {
    //递归，dfs
    class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if(p==null && q==null) {
                return true;
            }
            if (p==null || q==null) {
                return false;
            }
            if (p.val != q.val) {
                return false;
            }
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }
    }
    //todo:BFS
}
/**
 *  树 BFS DFS 二叉树
 */