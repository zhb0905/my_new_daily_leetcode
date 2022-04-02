package com.zhb.medium.from1to50;

/**
 * @author zhb
 * @create 2022-03-25 1:10
 */

/**
 * 11. 盛最多水的容器
 * 给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
 *
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 返回容器可以储存的最大水量。
 *
 * 说明：你不能倾斜容器。
 */

public class Problem_11_MaxArea {
    /**
     * 题目描述：求 max { (j-i) * min{nums[i], nums[j]} } , 其中j > i
     *
     * 思路： 定义 area[i][j] = (j-i) * min{nums[i], nums[j]}
     *       假设： nums[i] < nums[j],
     *       那么：area[i][j] > nums[i][k] , 其中 k < j  //压缩解空间
     *       则：maxArea(nums[i:j+1]) = max {maxArea(nums[i+1:j+1]), area[i][j]}  // [i:j] python切片
     *         ||
     *         |
     *        \/
     *      对撞指针
     *
     * debug记录：一：AC
     */
    class Solution {
        public int maxArea(int[] nums) {
            int maxArea = 0;
            int left = 0;
            int tempArea = 0;
            int right = nums.length - 1;
            while (left < right) {
                tempArea = (right - left) * Math.min(nums[left], nums[right] );
                maxArea =Math.max(tempArea, maxArea);
                if (nums[left] < nums[right]) {
                    left++;
                } else {
                  right--;
                }
            }
            return maxArea;
        }
    }
}

/**
 * 双指针 数组 贪心
 */