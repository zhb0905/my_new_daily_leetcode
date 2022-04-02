package com.zhb.simple.from401to450;

/**
 * @author zhb
 * @create 2022-04-01 1:39
 */

import java.util.LinkedList;
import java.util.List;

/**
 * 448. 找到所有数组中消失的数字
 * 给你一个含 n 个整数的数组 nums ，其中 nums[i] 在区间 [1, n] 内。请你找出所有在 [1, n] 范围内但没有出现在 nums 中的数字，并以数组的形式返回结果。
 *
 * 进阶：你能在不使用额外空间且时间复杂度为 O(n) 的情况下解决这个问题吗? 你可以假定返回的数组不算在额外空间内。
 */
public class Problem_448_FindDisappearedNumbers {
    /**
     * 描述：O(1)空间找 [1,n] - set(nums)
     * 思路： nums[key] = value ==> 标记nums[value]且不影响 nums[value] ==> 模数组长
     *
     * debug记录：一： 状态：解答错误  19 / 33 个通过测试用例  最后执行的输入：[4,3,2,7,8,2,3,1]  输出：[6]   预期结果：[5,6]
     *          debug: line38:  -:<   +:<=
     *          二：AC
     *
      */
    class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) { //[4,3,2,7,8,2,3,1]
            int value;
            for (int i = 0; i < nums.length; i++) {
                value = ( nums[i] - 1 ) % nums.length;
                nums[value] += nums.length;
            }
            //此时：nums[key] = nums[key] + k * nums.length , k是个数
            // nums[key] < nums.length ===> key not in values
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] <= nums.length) {
                    list.add(i+1);
                }
            }
            return list;
        }
    }
}
/**
 * 数组 哈希表
 */