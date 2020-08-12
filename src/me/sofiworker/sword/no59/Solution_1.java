package me.sofiworker.sword.no59;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sofiworker
 * @date 2020/8/12
 */
public class Solution_1 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) {
            return new int[0];
        }
        if (nums.length == k) {
            int max = nums[0];
            for (int num : nums) {
                if (num > max) {
                    max = num;
                }
            }
            int[] res = new int[1];
            res[0] = max;
            return res;
        }
        int[] result = new int[nums.length - k + 1];
        int index = 0;
        for (int i = 0; i < nums.length - k + 1; i++) {
            int max = nums[i];
            for (int j = i; j < i + k; j++) {
                if (nums[j] > max) {
                    max = nums[j];
                }
            }
            result[index++] = max;
        }
        return result;
    }
}
