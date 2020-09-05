package me.sofiworker.weekly.no1567;

/**
 * @author sofiworker
 * @date 2020/9/4
 */
public class Solution {

    public int getMaxLen(int[] nums) {
        if (nums == null) {
            return 0;
        }
        if (nums.length == 1 && nums[0] <= 0) {
            return 0;
        }
        int maxLen = 0;
        for (int i = 1; i < nums.length; i++) {
//            nums[i] = nums[i] * nums[i-1];
            if (nums[i] * nums[i-1] > 0) {
                maxLen = i;
            }
            if (nums[i] * nums[i-1] != 0) {
                nums[i] = nums[i] * nums[i-1];
            }
        }
        return nums[0] == 0 ? maxLen : maxLen + 1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().getMaxLen(new int[]{1000000000, 1000000000}));
    }
}
