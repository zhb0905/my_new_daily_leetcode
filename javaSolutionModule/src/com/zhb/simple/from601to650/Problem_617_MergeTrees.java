package com.zhb.simple.from601to650;

/**
 * @author zhb
 * @create 2022-04-01 1:42
 */

import com.zhb.mylocallib.TreeNode;

/**
 * 617. 合并二叉树
 * 给你两棵二叉树： root1 和 root2 。
 *
 * 想象一下，当你将其中一棵覆盖到另一棵之上时，两棵树上的一些节点将会重叠（而另一些不会）。你需要将这两棵树合并成一棵新二叉树。合并的规则是：如果两个节点重叠，那么将这两个节点的值相加作为合并后节点的新值；否则，不为 null 的节点将直接作为新二叉树的节点。
 *
 * 返回合并后的二叉树。
 *
 * 注意: 合并过程必须从两个树的根节点开始。
 */
public class Problem_617_MergeTrees {
    /**
     * 思路：递归
     *
     * debug记录：一：AC
     */
    class Solution {
        public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
            if(root1 == null) {
                return root2;
            }
            if(root2 == null) {
                return root1;
            }
            TreeNode root = new TreeNode();
            root.val = root1.val + root2.val;
            root.left = mergeTrees(root1.left, root2.left) ;
            root.right = mergeTrees(root1.right, root2.right);
            return root;
        }
    }
}
/**
 * 树 dfs bfs 递归
 */