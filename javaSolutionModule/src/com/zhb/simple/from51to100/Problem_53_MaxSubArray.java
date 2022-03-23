package com.zhb.simple.from51to100;

/**
 * @author zhb
 * @create 2022-03-24 2:36
 */

/**
 * 53. 最大子数组和
 *
 * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 子数组 是数组中的一个连续部分。
 *
 * input：[-1] -> output: -1 (不是0)
 */
public class Problem_53_MaxSubArray {
    // 方法一：线性DP
    class Solution {
        //线性DP f(k)=max{\sums nums[...,k]} , k = 0,1,...,n
        // answer = max {f(k)}
        // 递推式 ： f（k+1） = max{ f(k)+nums[k+1], nums[k+1] }
        public int maxSubArray(int[] nums) {
            int length = nums.length;
            int[] f = new int[length];
            if(nums == null || nums.length == 0){return 0;}
            f[0] = nums[0] ;
            int max = f[0];
            for (int i = 1; i < length; i++) {
                f[i] = f[i-1] + nums[i] > nums[i] ? (f[i-1] + nums[i]) : nums[i];
                max = Math.max(max,f[i]);

            }
            return max;
        }
    }
    // 方法二: 分治，线段树
}
/**
 * 标签： 数组 分治 动态规划
 */