package me.sofiworker.leetcode.no392;

/**
 * @author sofiworker
 * @date 2020/8/19
 */
public class Solution {

    public boolean isSubsequence(String s, String t) {
        int preIndex = 0;
        for (char c : s.toCharArray()) {
            int index = t.indexOf(c, preIndex);
            if (index == -1) {
                return false;
            }
            preIndex = index + 1;
        }
        return true;
    }
}
