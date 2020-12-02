package me.sofiworker.weekly.no5507;

import java.util.HashSet;
import java.util.Set;

/**
 * @author sofiworker
 * @date 2020/9/6
 */
public class Solution {

    public String modifyString(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '?') {
                if ((i - 1 >= 0 && chars[i-1] != '?') && (i + 1 < chars.length && chars[i+1] != '?')) {

                }
            }else {
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }
}
