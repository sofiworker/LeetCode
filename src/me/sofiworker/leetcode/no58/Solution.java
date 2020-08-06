package me.sofiworker.leetcode.no58;

import java.util.regex.Pattern;

/**
 * @author sofiworker
 * @date 2020/8/5
 */
public class Solution {

    public int lengthOfLastWord(String s) {
        if (s.trim().length() == 0) {
            return 0;
        }
        String[] strings = s.split(" ");
        if (strings[strings.length - 1].matches("^[A-Za-z]+$")) {
            return strings[strings.length - 1].length();
        }else {
            return 0;
        }
    }
}
