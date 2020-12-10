package me.sofiworker.top100.no169;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sofiworker
 * @date 2020/12/7
 */
public class Solution {

    public int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            Integer val = map.get(num);
            if (val == null) {
                map.put(num, 1);
                continue;
            }
            val++;
            map.put(num, val);
            if (map.get(num) > nums.length / 2) {
                return num;
            }
        }
        return 0;

//        Arrays.sort(nums);
//        return nums[nums.length / 2];
    }
}
