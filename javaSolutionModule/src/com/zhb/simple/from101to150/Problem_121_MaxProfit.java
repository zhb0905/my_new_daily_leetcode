package com.zhb.simple.from101to150;

/**
 * @author zhb
 * @create 2022-03-31 21:55
 */

/**
 * 121. 买卖股票的最佳时机
 * 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
 *
 * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 *
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 */
public class Problem_121_MaxProfit {
    /**
     * 描述：max {a[j] - a[i]} , 其中j > i
     * 思路：快慢指针。fast右滑至小于left，更新left。重复此过程。
     * debug记录： 一：AC
     */
    class Solution {
        public int maxProfit(int[] prices) {
            //[i,j] === [left,right-1]
            int left = 0 ;
            int right = 1;
            int maxProfit = 0 ;
            if(prices == null || prices.length <= 1 ) {
                return 0;
            }
            while(right < prices.length ) {
                while (right < prices.length && prices[right] >= prices[left]) {
                    maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
                    right++;
                }
                if(right == prices.length) {
                    return maxProfit;
                }
                left = right;
                right++;
            }
            return maxProfit;
        }
    }
}
/**
 * 数组 动态规划
 */