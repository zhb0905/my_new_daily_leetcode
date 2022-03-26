package com.zhb.simple.from101to150;

/**
 * @author zhb
 * @create 2022-03-26 20:28
 */

import com.zhb.mylocallib.TreeNode;

/**
 * 112. 路径总和
 * 给你二叉树的根节点 root 和一个表示目标和的整数 targetSum 。
 * 判断该树中是否存在 根节点到叶子节点 的路径，这条路径上所有节点值相加等于目标和 targetSum 。
 * 如果存在，返回 true ；否则，返回 false 。
 */
public class Problem_112_HasPathSum {
    /**
     * 思路: 自顶向下 node.val += node.father.val,等价于
     * hasPathSum(root,targetSum) <-- hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val)
     */
    /**
     * debug记录：
     * 一： 116 / 117 个通过测试用例 状态：解答错误 。 输入：[] 0  输出：true  预期结果：false
     *      debug: 空树, 0 的情况 是特例。 +: if (root == null ) {return false;}
     *
     * 二： AC
     *
     *
     */
    class Solution {
        public boolean hasPathSum(TreeNode root, int targetSum) {
            if (root == null ) {
                return false;
            }
            else return hasPathSumUnEmptyTree(root,targetSum);
        }
        public boolean hasPathSumUnEmptyTree(TreeNode root, int targetSum) {
            if (root == null ) {
                return targetSum ==0;
            }

            if(root.left == null && root.right == null) {
                return targetSum == root.val;
            }
            if(root.left != null && root.right != null) {
                return hasPathSumUnEmptyTree(root.left, targetSum-root.val) || hasPathSumUnEmptyTree(root.right, targetSum-root.val);
            }
            if (root.left != null ) {
                return hasPathSumUnEmptyTree(root.left, targetSum-root.val);
            }
            if (root.right != null) {
                return hasPathSumUnEmptyTree(root.right, targetSum-root.val);
            }
            return false;
        }
    }
}
/**
 * 树 DFS BFS 二叉树
 */