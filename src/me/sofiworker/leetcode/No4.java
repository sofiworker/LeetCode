package me.sofiworker.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.*;


/**
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * 你可以假设 nums1 和 nums2 不会同时为空。
 * 示例 1:
 * nums1 = [1, 3]
 * nums2 = [2]
 * 则中位数是 2.0
 *示例 2:
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * 则中位数是 (2 + 3)/2 = 2.5
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class No4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = Arrays.copyOf(nums1, nums1.length + nums2.length);
        System.arraycopy(nums2, 0, nums3, nums1.length, nums2.length);
        Arrays.sort(nums3);
        int i = nums3.length % 2;
        if (i == 1){
            return nums3[nums3.length /2];
        }else {
            return (nums3[nums3.length /2] + nums3[nums3.length /2 - 1]) / 2.0;
        }
    }

    public static void main(String[] args) {
        int a = 10;
        int b = a;
        a--;
        b++;
        System.out.println(a+"-"+b);
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        List<Integer> list1 = list;
        System.out.println(list.hashCode()+"-"+list1.hashCode());
        list.set(0, 0);
        System.out.println(list+"-"+list1);
        list = null;
        System.out.println(list+"-"+list1);
        HashMap<String, String> stringStringHashMap = new HashMap<>(16);
        stringStringHashMap.put("111", "aaaaaaaaaa");

    }

    static class Aa {
        int a = 10;
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
    }
}
