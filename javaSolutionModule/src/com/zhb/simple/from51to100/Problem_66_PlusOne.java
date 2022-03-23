package com.zhb.simple.from51to100;

/**
 * @author zhb
 * @create 2022-03-24 3:29
 */

import java.util.Arrays;

/**
 * 66. 加一
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/plus-one
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Problem_66_PlusOne {

    //类似BigInteger
    class Solution {
        public int[] plusOne(int[] digits) {
            int carryBit = 1;
            for (int i = digits.length-1; i >= 0 ; i--) {

                int tempSum = digits[i] + carryBit;
                carryBit = tempSum / 10;
                digits[i] = tempSum % 10;
            }
            //todo:处理最高位溢出
            if(carryBit ==1) {
                int[] result = new int[digits.length + 1];
                result[0] = 1;
                for (int i = 1; i < digits.length + 1; i++) {
                    result[i] = digits[i-1];
                }
                return result;
            }
            return digits;
        }
    }
}
/**
 * 标签 ：  数组 ；数学
 */