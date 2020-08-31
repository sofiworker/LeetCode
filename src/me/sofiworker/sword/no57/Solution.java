package me.sofiworker.sword.no57;

/**
 * @author sofiworker
 * @date 2020/8/30
 */
public class Solution {

    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return new int[0];
        }
        if (nums.length == 2 && target == nums[0] + nums[1]) {
            return nums;
        }
        int l = 0;
        int r = nums.length;
        int mid = (l + r) / 2;
        if (nums[mid] <= target) {

        }
        return new int[0];
    }

//    private int find() {
//
//    }
}
