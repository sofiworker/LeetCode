package me.sofiworker.sword.no63;

/**
 * @author sofiworker
 * @date 2020/8/16
 */
public class Solution {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = prices.length - 1; j > i; j--) {
                if (prices[j] - prices[i] > 0 && prices[j] - prices[i] > maxProfit) {
                    maxProfit = prices[j] - prices[i];
                }
            }
        }
        return maxProfit;
    }

    public int maxProfit1(int[] prices) {
        return 0;
    }
}
