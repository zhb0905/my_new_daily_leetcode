package com.zhb.simple.from1to50;

/**
 * @author zhb
 * @create 2022-03-24 2:07
 */

/** 35. 搜索插入位置
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 请必须使用时间复杂度为 O(log n) 的算法。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/search-insert-position
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 */
public class Problem_35_SearchInsert {
    //二分查找
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int left = 0;
            int right = nums.length-1;
            int middle;
            while (left <= right) {
                middle = (left + right) / 2;
                if (nums[middle]==target) {return middle;}
                else if (nums[middle] < target) {
                    left = middle + 1;
                }
                else {
                    right =middle - 1;
                }

            }
            //此时: left === right + 1 ; [0...left-1] < target; [right+1...length] > target
            return left;

        }
    }
}

/**
 * 标签 ： 数组， 二分查找
 */