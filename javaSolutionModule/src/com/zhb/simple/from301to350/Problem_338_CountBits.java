package com.zhb.simple.from301to350;

/**
 * @author zhb
 * @create 2022-04-01 1:39
 */

/**
 * 338. 比特位计数
 * 给你一个整数 n ，对于 0 <= i <= n 中的每个 i ，计算其二进制表示中 1 的个数 ，返回一个长度为 n + 1 的数组 ans 作为答案。
 */
public class Problem_338_CountBits {
    /**
     * 描述：二进制 1 位数
     * 思路： 4567 <== 0123 + 最高位1。故动态规划
     * ans[k+2**n] = ans[k] + 1, 其中 k < 2**n (Python幂)
     *
     * debug记录：一：AC
     */
    class Solution {
        public int[] countBits(int n) {
            if (n == 0) {
                return new int[]{0};
            }
            int[] ans = new int[n+1];
            int power = 0;//2**k
            int now = 2;//ans[0]=0;
            ans[1] = 1;
            while(now < n + 1) {
                if (now >= Math.pow(2,power + 1)) {
                    power++;
                }
                ans[now] = ans[now - (int)Math.pow(2, power)] + 1;
                now++;
            }
            return ans;
        }
    }

}
/**
 * 位运算 动态规划
 */