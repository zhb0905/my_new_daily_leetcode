package com.zhb.medium.from1to50;

/**
 * @author zhb
 * @create 2022-03-25 1:11
 */

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


/**
 * 15. 三数之和
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 */
public class Problem_15_ThreeSum {
    /**
     * 思路: 排序 对撞指针
     * debug记录: 一：AC
     */
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> ans = new LinkedList<>();
            int key;
            for (int first = 0; first < nums.length; first++) {
                if(first > 0 && nums[first] == nums[first-1]) {
                    continue;
                }
                int third = nums.length - 1;
                int second = first ;
                while (++second < third) {
                    if(second > first+1 && nums[second] ==nums[second-1]) {
                        continue;
                    }
                    while(second <= third && nums[first] + nums[second] + nums[third] > 0) {
                        third--;
                    }
                    if(second >= third) {
                        break;
                    }
                    if (nums[first] + nums[second] + nums[third] == 0) {
                        List<Integer> list = new LinkedList<>();
                        list.add(nums[first]);
                        list.add(nums[second]);
                        list.add(nums[third]);
                        ans.add(list);
                    }
                }
            }
            return ans;
        }
    }
    Solution solution = new Solution();
    @Test
    public void test(){
        solution.threeSum(new int[]{-1,0,1,2,-1,-4});
    }
}
/**
 * 数组 双指针 排序
 */