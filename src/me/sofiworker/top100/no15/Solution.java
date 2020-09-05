package me.sofiworker.top100.no15;

import java.util.*;

/**
 * @author sofiworker
 * @date 2020/9/4
 */
public class Solution {

    private final List<String> list = new ArrayList<>();

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        Arrays.sort(nums);
        List<List<Integer>> resList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    String s = "" + nums[i] + nums[j] + nums[k];
                    if (nums[i] + nums[j] + nums[k] == 0 && !contains(s)) {
                        List<Integer> tempList = new ArrayList<>();
                        tempList.add(nums[i]);
                        tempList.add(nums[j]);
                        tempList.add(nums[k]);
                        resList.add(tempList);
                        list.add(s);
                    }
                }
            }
        }
        return resList;
    }

    private boolean contains(String str) {
        for (String s : list) {
            if (s.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public List<List<Integer>> threeSum1(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int k = 0; k < nums.length - 2; k++){
            if(nums[k] > 0) {
                break;
            }
            if(k > 0 && nums[k] == nums[k - 1]) {
                continue;
            }
            int i = k + 1, j = nums.length - 1;
            while(i < j){
                int sum = nums[k] + nums[i] + nums[j];
                if(sum < 0){
                    while(i < j && nums[i] == nums[++i]) {
                    }
                } else if (sum > 0) {
                    while(i < j && nums[j] == nums[--j]) {
                        ;
                    }
                } else {
                    res.add(new ArrayList<>(Arrays.asList(nums[k], nums[i], nums[j])));
                    while(i < j && nums[i] == nums[++i]) {
                        ;
                    }
                    while(i < j && nums[j] == nums[--j]) {
                        ;
                    }
                }
            }
        }
        return res;
    }
}
