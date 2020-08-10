package me.sofiworker.sword.no21;

/**
 * @author sofiworker
 * @date 2020/8/10
 */
public class Solution {

    public int[] exchange(int[] nums) {
        int[] result = new int[nums.length];
        int l = 0;
        int r = nums.length - 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                result[r] = num;
                r--;
            }
            if (num % 2 == 1) {
                result[l] = num;
                l++;
            }
        }
        return result;
    }
}
