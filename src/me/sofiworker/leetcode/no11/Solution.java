package me.sofiworker.leetcode.no11;

/**
 * @author sofiworker
 * @date 2020/8/6
 */
public class Solution {

    public int maxArea(int[] height) {
        int result = 0;
        for (int i = 0; i < height.length-1; i++) {
            for (int j = i+1; j < height.length; j++) {
                int record = Math.min(height[i], height[j]);
                int r1 = record * (j - i);
                if (r1 > result) {
                    result = r1;
                }
            }
        }
        return result;
    }
}
