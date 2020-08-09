package me.sofiworker.weekly.no5483;

import java.util.Arrays;

/**
 * @author sofiworker
 * @date 2020/8/9
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().makeGood("Pp"));
    }

    public String makeGood(String s) {
        if (s.isEmpty()) {
            return "";
        }
        char[] chars = s.toCharArray();
        char[] res = new char[s.length()];
        for (int i = 0; i < chars.length - 1; i++) {
            if ((i <= s.length() - 2 && (chars[i] >= 'a' && chars[i] <= 'z' && chars[i + 1] >= 'A' && chars[i + 1] <= 'Z' && chars[i]-32 == chars[i+1]))
            || (i <= s.length() - 2 && (chars[i] >= 'A' && chars[i] <= 'Z' && chars[i + 1] >= 'a' && chars[i + 1] <= 'z' && chars[i]+32 == chars[i+1]))) {
                chars[i] = '1';
                chars[i+1] = '1';
                i++;
            }
        }
        int count = 0;
        for (char aChar : chars) {
            if (aChar != '1') {
                res[count++] = aChar;
            }
        }
        char[] value = Arrays.copyOf(res, count);
        String s1 = new String(value);
        if (s.equals(s1)) {
            return s1;
        }else {
            return makeGood(s1);
        }
    }
}
