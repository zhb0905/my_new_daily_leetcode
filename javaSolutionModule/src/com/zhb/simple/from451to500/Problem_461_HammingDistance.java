package com.zhb.simple.from451to500;

/**
 * @author zhb
 * @create 2022-04-01 1:41
 */

import org.junit.Test;

/**
 * 461. 汉明距离
 * 两个整数之间的 汉明距离 指的是这两个数字对应二进制位不同的位置的数目。
 *
 * 给你两个整数 x 和 y，计算并返回它们之间的汉明距离。
 */
public class Problem_461_HammingDistance {
    class Solution {
        public int hammingDistance(int x, int y) {
            int  xor = x ^ y ;
            int ans = 0;
            while (xor > 0) {
                if (xor % 2 == 1) {
                    ans++;
                }
                xor = xor >> 1;
            }
            return ans;
        }

    }
 /*   Solution solution = new Solution();
    @Test
    public void test(){
        System.out.println(solution.hammingDistance(1, 4));
    }*/
}
/**
 * 位运算
 */