package com.zhb.simple.from251to300;

/**
 * @author zhb
 * @create 2022-04-01 1:37
 */

/**
 * 283. 移动零
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 *
 * 进阶：你能尽量减少完成的操作次数吗？
 */
public class Problem_283_MoveZeroes {
    /**
     * 描述：原地移数
     * 思路：快慢指针。[0,slow]：非0数组
     *
     * debug记录：一：AC
     */
    class Solution {
        public void moveZeroes(int[] nums) {
            int slow = -1;
            int fast = 0;
            while (fast < nums.length) {
                if (nums[fast] != 0) {
                    slow++;
                    nums[slow] = nums[fast];
                    fast++;
                } else {
                    fast++;
                }
            }
            for (int i = slow + 1; i < nums.length; i++) {
                nums[i] = 0;
            }
        }
    }
}
/**
 * 数组 双指针
 */