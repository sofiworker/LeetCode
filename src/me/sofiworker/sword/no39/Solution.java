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
        int i = 0;
        int j = nums.length - 1;
        int mid = (i + j) / 2;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (; i <= mid && j >= mid; i++, j--) {
//            if (hashMap.get(nums[i]) != null) {
//                hashMap.putIfAbsent()
//            }
        }
        return -1;
    }
}
