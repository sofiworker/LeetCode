package me.sofiworker.sword.no56;

import java.util.Arrays;

/**
 * @author sofiworker
 * @date 2020/8/30
 */
public class Solution_1 {

    public int[] singleNumbers(int[] nums) {
        if (nums == null || nums.length < 4) {
            return new int[0];
        }
        int[] res = new int[2];
        Arrays.sort(nums);
        int j = 0, count = 1;
        for (int i = 1; i < nums.length - 1; i++) {
//            if () {
//                res[j++] = nums[i-1];
//            }
        }
        return res;
    }
}
