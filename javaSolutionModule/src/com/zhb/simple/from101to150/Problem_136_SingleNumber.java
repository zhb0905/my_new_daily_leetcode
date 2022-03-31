package com.zhb.simple.from101to150;

/**
 * @author zhb
 * @create 2022-03-31 22:44
 */

/**
 * 136. 只出现一次的数字
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 */
public class Problem_136_SingleNumber {
    /**
     * 描述：空间：O(1)，时间：O(n),找唯一的非成对元素
     * 思路：位运算异或。 a ^ b ^ a === a ^ a ^ b === 0 ^ b === b
     * debug记录：一：AC
     */
    class Solution {
        public int singleNumber(int[] nums) {
            int ans = 0 ;
            for (int num: nums) {
                ans = ans ^ num;
            }
            return ans;
        }
    }
}
/**
 * 位运算 数组
 */