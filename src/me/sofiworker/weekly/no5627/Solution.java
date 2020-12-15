package me.sofiworker.weekly.no5627;

import java.util.Arrays;

/**
 * @author sofiworker
 * @date 2020/12/13
 */
public class Solution {

    public int stoneGameVII(int[] stones) {
        return count(stones, 0, stones.length - 1);
    }

    public int count(int[] stones, int l, int r) {
        if (stones == null || stones.length == 0) {
            return 0;
        }
//        return Math.min(stones[0] - Math.max(),
//                stones[stones.length - 1] - );
        return 0;
    }
}
