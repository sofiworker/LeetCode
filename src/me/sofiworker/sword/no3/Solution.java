package me.sofiworker.sword.no3;

import java.util.HashSet;
import java.util.Set;

/**
 * @author sofiworker
 * @date 2020/8/3
 */
public class Solution {

    public int findRepeatNumber(int[] nums) {
        int[] record = new int[nums.length];
        int result = 0;
        for (int num : nums) {
            record[num] += 1;
            if (record[num] > 1) {
                result = num;
                break;
            }
        }
        return result;
    }

    public int findRepeatNumber2(int[] nums) {
        if (nums == null) {
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            }
            set.add(num);
        }
        return 0;
    }
}
