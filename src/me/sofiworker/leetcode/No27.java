package me.sofiworker.leetcode;

/**
 * @author sofiworker
 * @version 1.0.0
 * @date 2020/4/10 8:45
 * @description
 */
public class No27 {

    static class Solution {
        public int removeElement(int[] nums, int val) {
            int newLen = nums.length;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == val) {
                    newLen--;
                }
            }

            return newLen;
        }
    }
}
