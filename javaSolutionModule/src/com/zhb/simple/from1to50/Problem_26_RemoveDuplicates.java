package com.zhb.simple.from1to50;

/**
 * @author zhb
 * @create 2022-03-23 22:14
 */

/**
 * 26. 删除有序数组中的重复项 (原数组升序排列，要求：原地)
 * 标签 ： 数组  双指针
 */
public class Problem_26_RemoveDuplicates {
    class Solution {
        //快慢指针。 慢：左边是答案数组。快：遍历（leftBiggestPosition:快指针左边的最大值,也就是nums[left]===nums[leftBiggestPosition]）
        //todo:优化：去掉leftBiggestPosition，用left直接实现其作用
        public int removeDuplicates(int[] nums) {
            int slow = 0;
            int fast = 0;
            if (nums == null || nums.length == 0) {
                return 0;
            }
            int leftBiggestPosition = 0;
            for (int i = 1; i < nums.length; i++) { // i 就是fast
                //todo:快慢指针
                if (nums[i] > nums[leftBiggestPosition]) {
                    slow++;
                    leftBiggestPosition = i;
                    nums[slow] = nums[leftBiggestPosition];

                    continue;
                }
                else if (nums[i] == nums[leftBiggestPosition]) {
                    continue;
                }
            }
            return slow+1;
        }
    }
}
