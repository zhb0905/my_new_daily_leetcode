package com.zhb.simple.from101to150;

/**
 * @author zhb
 * @create 2022-03-26 18:09
 */

import com.zhb.mylocallib.TreeNode;

/**
 * 104. 二叉树的最大深度
 */
public class Problem_104_MaxDepth {

    class Solution {
        public int maxDepth(TreeNode root) {
            return depthRecursive(root);
        }

        public int depthRecursive(TreeNode treeNode) {
            if(treeNode == null ) {
                return 0;
            }
            return 1 + Math.max(depthRecursive(treeNode.left), depthRecursive(treeNode.right));

        }
    }

}

/**
 *  树 dsf bsf 二叉树
 */