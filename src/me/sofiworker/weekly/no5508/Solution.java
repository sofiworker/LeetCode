package me.sofiworker.weekly.no5508;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * @author sofiworker
 * @date 2020/9/6
 */
public class Solution {

    public int numTriplets(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) {
            return 0;
        }
        int res = 0;
        if (nums2.length >= 2) {
            Arrays.sort(nums2);
            for (int value : nums1) {
                int l = 0; int r = nums2.length - 1;
                BigInteger multiply1 = new BigInteger(String.valueOf(value)).multiply(new BigInteger(String.valueOf(value)));
                while (l < r) {
                    BigInteger multiply2 = new BigInteger(String.valueOf(nums2[l])).multiply(new BigInteger(String.valueOf(nums2[r])));
                    if (multiply1.compareTo(multiply2) < 0) {
                        r--;
                    }else if (multiply1.compareTo(multiply2) == 0) {
                        res++;
                    }else if (multiply1.compareTo(multiply2) > 0) {
                        l++;
                    }
                }
            }
        }
        if (nums1.length >= 2) {
            Arrays.sort(nums1);
            for (int value : nums2) {
                int l = 0; int r = nums1.length - 1;
                BigInteger multiply1 = new BigInteger(String.valueOf(value)).multiply(new BigInteger(String.valueOf(value)));
                while (l < r) {
                    BigInteger multiply2 = new BigInteger(String.valueOf(nums1[l])).multiply(new BigInteger(String.valueOf(nums1[r])));
                    if (multiply1.compareTo(multiply2) > 0) {
                        l++;
                    }else if (multiply1.compareTo(multiply2) == 0) {
                        res++;
                    }else if (multiply1.compareTo(multiply2) < 0) {
                        r--;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().numTriplets(new int[]{43024, 99908}, new int[]{1864}));
    }
}
