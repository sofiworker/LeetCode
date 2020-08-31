package me.sofiworker.sword.no39;

import java.util.HashMap;

/**
 * @author sofiworker
 * @date 2020/8/25
 */
public class Solution {

    public int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int mid = nums.length / 2;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            Integer val = hashMap.get(num);
            if (val == null) {
                hashMap.put(num, 1);
                continue;
            }
            if (val >= mid) {
                return num;
            }
            hashMap.put(num, val+1);
        }
        return -1;
    }
}
