package me.sofiworker.weekly.no5626;

import java.util.Arrays;

/**
 * @author sofiworker
 * @date 2020/12/13
 */
public class Solution {

    public int minPartitions(String n) {
        char[] a = n.toCharArray();
        Arrays.sort(a);
        return a[a.length - 1] - '0';
    }
}
