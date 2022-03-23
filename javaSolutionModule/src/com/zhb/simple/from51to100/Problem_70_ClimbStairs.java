package com.zhb.simple.from51to100;

/**
 * @author zhb
 * @create 2022-03-24 6:11
 */

/**
 * 70.爬楼梯
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 */
public class Problem_70_ClimbStairs {
    //DP : f(n) = f(n-1) + f(n-2)
    class Solution {
        public int climbStairs(int n) {
            int[] f = new int[n+5];
            f[0] = 0;
            f[1] = 1;
            f[2] = 2;
            for (int i = 3; i < n+1; i++) {
                f[i] = f[i-1] + f[i-2] ;

            }
            return f[n];
        }
    }
}
/**
 * 记忆化搜索  数学 动态规划
 */
