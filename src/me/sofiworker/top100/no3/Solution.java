package me.sofiworker.top100.no3;

import java.util.HashSet;
import java.util.Set;

/**
 * @author sofiworker
 * @date 2020/9/4
 */
public class Solution {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        char[] chars = s.toCharArray();
        Set<Character> set = new HashSet<>();
        int maxLen = 0;
        for (int i = 0; i < chars.length; i++) {
            set.add(chars[i]);
            for (int j = i + 1; j < chars.length; j++) {
                if (set.contains(chars[j])) {
                    if (maxLen < set.size()) {
                        maxLen = set.size();
                    }
                    set.clear();
                    break;
                }else {
                    set.add(chars[j]);
                }
            }
        }
        if (maxLen < set.size()) {
            maxLen = set.size();
        }
        return maxLen;
    }
}
