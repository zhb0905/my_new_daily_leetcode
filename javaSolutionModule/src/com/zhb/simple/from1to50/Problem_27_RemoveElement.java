package com.zhb.simple.from1to50;

/**
 * @author zhb
 * @create 2022-03-24 1:34
 */

/**
 * 27. 移除元素
 *
 * 给你一个数组 nums和一个值 val，你需要 原地 移除所有数值等于val的元素，并返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 *
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-element
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 标签 ： 数组  双指针
 */
public class Problem_27_RemoveElement {
    class Solution {
        //快慢指针：慢：答案数组
        //todo:优化一：将nums[i] == val 的 nums[i] 与 nums[rightPointer] 对换
        public int removeElement(int[] nums, int val) {
            int slow = 0;//0,...,slow-1
            int fast = 0;
            if (nums == null || nums.length == 0) {return 0;}
            for (int i = 0; i < nums.length; i++) {
                if( nums[i] != val) {
                    nums[slow]=nums[i];
                    slow++;
                }
            }
            return slow;
        }
    }
}
