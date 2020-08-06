package me.sofiworker.leetcode.no476;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sofiworker
 * @date 2020/8/4
 */
public class Solution {

    public int findComplement(int num) {
        if (num == 1) {
            return 0;
        }else if (num == 0) {
            return 1;
        }
        List<Integer> nums = new ArrayList<>();
        while (num != 0){
            nums.add(num % 2);
            num = num / 2;
        }
        int result = 0;
        for (int i = 0; i < nums.size(); i++) {
            int a = nums.get(i);
            if (a == 0) {
                result += Math.pow(2, i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().findComplement(5));
    }
}
