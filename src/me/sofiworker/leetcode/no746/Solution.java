package me.sofiworker.leetcode.no746;

/**
 * @author sofiworker
 * @date 2020/8/19
 */
public class Solution {

    public int minCostClimbingStairs(int[] cost) {
        return Math.min(from0(cost), from1(cost));
    }

    private int from0(int[] cost) {
        int index = 0;
        for (int i = 0; i < cost.length; ) {
            if (cost[i+1] > cost[i+2]) {
                cost[i] = cost[i+2] + cost[i];
                i = i + 2;
            }else {
                cost[i] = cost[i+1] + cost[i];
                i = i + 1;
            }
            index = i;
        }
        return cost[index];
    }

    private int from1(int[] cost) {
        int index = 0;
        for (int i = 1; i < cost.length; ) {
            if (cost[i+1] > cost[i+2]) {
                cost[i] = cost[i+2] + cost[i];
                i = i + 2;
            }else {
                cost[i] = cost[i+1] + cost[i];
                i = i + 1;
            }
            index = i;
        }
        return cost[index];
    }
}
