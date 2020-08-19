package me.sofiworker.leetcode.no53;

/**
 * @author sofiworker
 * @date 2020/8/18
 */
public class Solution {

    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int sum = nums[0];
        for(int i=1; i<nums.length; i++) {
            if(nums[i-1] > 0) {
                nums[i] = nums[i]+nums[i-1];
            }
            if(nums[i] > sum) {
                sum = nums[i];
            }
        }
        return sum;
    }
}
