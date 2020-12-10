package me.sofiworker.sword.no5;

import java.util.regex.Pattern;

/**
 * @author sofiworker
 * @date 2020/8/3
 */
public class Solution {

    public String replaceSpace(String s) {
        return s.replace(" ", "%20");
    }

    public String replaceSpace2(String s) {
        if (s == null) {
            return null;
        }
        Pattern p = Pattern.compile("\\s");
        return p.matcher(s).replaceAll("%20");
    }

    public String replaceSpace3(String s) {
        if (s == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append("%20");
            }else {
                sb.append(s.charAt(i));
            }
        }
        return new String(sb);
    }
}
