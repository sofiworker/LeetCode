package me.sofiworker.weekly.no5185;

/**
 * @author sofiworker
 * @date 2020/8/16
 */
public class Solution {

    public boolean threeConsecutiveOdds(int[] arr) {
        if (arr.length  < 3) {
            return false;
        }
        boolean res = false;
        for(int i = 0; i < arr.length - 2; i++) {
            if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0 && arr[i + 2] % 2 != 0) {
                res = true;
                break;
            }
        }
        return res;
    }
}
