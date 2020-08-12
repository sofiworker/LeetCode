package me.sofiworker.sword.no53;

/**
 * @author sofiworker
 * @date 2020/8/12
 */
public class Solution_2 {

    public int missingNumber(int[] nums) {
        if (nums.length == 1 && nums[0] == 1) {
            return 0;
        }
        if (nums.length == 1 && nums[0] == 0) {
            return 1;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 != nums[i+1]) {
                return nums[i] + 1;
            }
        }
        if (nums[0] != 0) {
            return 0;
        }
        return nums[nums.length - 1] + 1;
    }

    // 二分
    public int missingNumber2(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == mid) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return left;
    }
}
