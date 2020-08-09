package me.sofiworker.sword.no11;

/**
 * @author sofiworker
 * @date 2020/8/9
 */
public class Solution {

    public int minArray(int[] numbers) {
        int l = 0;
        int r = numbers.length - 1;
        int res = -1;
        while (l < r) {
            if (numbers[l] > numbers[l+1]) {
                res = numbers[l+1];
                break;
            }
            if (numbers[r-1] > numbers[r]) {
                res = numbers[r];
                break;
            }
            l++;
            r--;
        }
        if (res == -1) {
            return numbers[0];
        }
        return res;
    }
}
