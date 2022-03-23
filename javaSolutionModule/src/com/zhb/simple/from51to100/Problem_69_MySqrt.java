package com.zhb.simple.from51to100;

/**
 * @author zhb
 * @create 2022-03-24 5:59
 */

/**
 * 69. x 的平方根
 * 给你一个非负整数 x ，计算并返回 x 的 算术平方根 。
 *
 * 由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。
 *
 * 注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sqrtx
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Problem_69_MySqrt {
    class Solution {
        public int mySqrt(int x) {
            int result = 0;
            int square = result * result;
            while (square >= 0 && square <=x) {
                result++;
                square = result * result;
            }
            return result-1;
        }
    }
}
/**
 * 标签 ： 数学 ：二分查找
 */