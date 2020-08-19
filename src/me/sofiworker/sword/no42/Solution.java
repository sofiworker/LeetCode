package me.sofiworker.sword.no42;

/**
 * @author sofiworker
 * @date 2020/8/17
 */
public class Solution {

    public int maxSubArray(int[] nums) {
        if (nums.length < 2) {
            return nums[0];
        }
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] > 0) {
                nums[i] = nums[i-1] + nums[i];
            }
            if (sum < nums[i]) {
                sum = nums[i];
            }
        }
        return sum;
    }
}
