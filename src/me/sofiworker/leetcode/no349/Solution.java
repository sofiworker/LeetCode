package me.sofiworker.leetcode.no349;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sofiworker
 * @date 2020/8/8
 */
public class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {
        int[] temp = new int[Math.max(nums2.length, nums1.length)];
        int index = 0;
        if (nums1.length < nums2.length) {
            for (int i : nums1) {
                for (int i1 : nums2) {
                    if (i == i1) {
                        if (index == 0) {
                            temp[index++] = i;
                        }
                        if (index > 0 && temp[index-1] != i) {
                            temp[index++] = i;
                        }
                        break;
                    }
                }
            }
        }else {
            for (int i : nums2) {
                for (int i1 : nums1) {
                    if (i == i1) {
                        if (index == 0) {
                            temp[index++] = i;
                        }
                        if (index > 0 && temp[index-1] != i) {
                            temp[index++] = i;
                        }
                        break;
                    }
                }
            }
        }
        int i = index;
        int[] result = new int[i];
        System.arraycopy(temp, 0, result, 0, i);
        return result;
    }

    public static void main(String[] args) {
//        int[] nums1 = {1, 2, 2, 1};
//        int[] nums2 = {2, 2};

        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        new Solution().intersection(nums1, nums2);
    }
}
