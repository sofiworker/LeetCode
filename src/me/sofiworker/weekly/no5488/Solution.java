package me.sofiworker.weekly.no5488;

/**
 * @author sofiworker
 * @date 2020/8/16
 */
public class Solution {

    private int minOperations(int n) {
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = (2 * i) + 1;
            sum += (2 * i) + 1;
        }
        int avg = sum / n;
        int res = 0;
        for (int i : arr) {
            if (i < avg) {
                res += (avg - i);
            }else {
                break;
            }
        }
        return res;
    }
}
