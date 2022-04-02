package com.zhb.simple.from151to200;

/**
 * @author zhb
 * @create 2022-04-01 1:36
 */

import com.zhb.mylocallib.TreeNode;

/**
 * 226. 翻转二叉树
 * 给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。
 */
public class Problem_226_InvertTree {
    /**
     * 描述：沿 z 轴作镜像
     * 思路：递归  invert(tree) === invert(leftSubTree) + invert(rightSubTree) + exchange(root.left, root.right)
     *
     * debug记录：一：AC
     */
    class Solution {
        public TreeNode invertTree(TreeNode root) {
            if(root == null) {
                return null;
            }
            TreeNode leftRoot = invertTree(root.left);
            TreeNode rightRoot = invertTree(root.right);
            root.left = rightRoot;
            root.right = leftRoot;
            return root;
        }
    }
}
/**
 * 树 DFS BFS 二叉树
 */