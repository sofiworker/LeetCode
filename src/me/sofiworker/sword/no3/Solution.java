package me.sofiworker.sword.no3;

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
}
