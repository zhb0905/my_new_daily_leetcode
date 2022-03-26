package com.zhb.simple.from101to150;

import com.zhb.mylocallib.TreeNode;

/**
 * @author zhb
 * @create 2022-03-26 19:24
 */

/**
 * 111. 二叉树的最小深度
 * 给定一个二叉树，找出其最小深度。
 *
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 *
 * 说明：叶子节点是指没有子节点的节点。
 */
public class Problem_111_MinDepth {
    /**
     * 思路：minDepth = min(left,right) + 1
     * debug：单分支时：minDepth = 1 + 分支
     */
    /**
     * debug记录：
     * 一：状态：解答错误 28 / 52 个通过测试用例 输入：[2,null,3,null,4,null,5,null,6] 输出：1 预期结果： 5
     *      debug : 忽略了单分支。 +: 后3个if
     * 二 ：AC
     */
    class Solution {
        public int minDepth(TreeNode root) {
            if(root == null) {
                return 0;
            }
            if (root.left == null && root.right == null) {
                return 1;
            }
            if(root.left == null) {
                return minDepth(root.right) + 1;
            }
            if (root.right == null ) {
                return minDepth(root.left) + 1;
            }
            return Math.min(minDepth(root.left),minDepth(root.right)) + 1;
        }

    }
}
/**
 * 树 DFS BDF 二叉树
 */