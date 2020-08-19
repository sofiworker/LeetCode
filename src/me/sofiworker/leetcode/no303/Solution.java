package me.sofiworker.leetcode.no303;

/**
 * @author sofiworker
 * @date 2020/8/19
 */
public class Solution {

    static class NumArray {

        private final int[] nums;

        public NumArray(int[] nums) {
            this.nums = nums;
        }

        public int sumRange(int i, int j) {
            if (i < 0 || j >= nums.length) {
                return -1;
            }
            int sum = 0;
            for (int k = i; k <= j; k++) {
                sum += nums[k];
            }
            return sum;
        }
    }
}
