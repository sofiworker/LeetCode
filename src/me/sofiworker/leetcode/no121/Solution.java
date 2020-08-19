package me.sofiworker.leetcode.no121;

/**
 * @author sofiworker
 * @date 2020/8/18
 */
public class Solution {

    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int profit = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            profit = Math.max(profit, prices[i] - min);
            if (prices[i] < min) {
                min = prices[i];
            }
        }
        return profit;
    }
}
