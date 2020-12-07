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
        Map<Integer, Integer> map = new HashMap<>();
        // TODO: 2020/12/7
        for (int num : nums) {
            Integer val = map.get(num);
            if (val == null) {
                map.put(num, 1);
            }else if (val > nums.length / 2) {
                return num;
            }else {
                map.put(num, val++);
            }
        }
        return 0;
    }
}
