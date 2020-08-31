package me.sofiworker.sword.no58;

/**
 * @author sofiworker
 * @date 2020/8/31
 */
public class Solution_1 {

    public String reverseWords(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        String[] strings = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            sb.append(strings[i]).append(" ");
        }
        return new String(sb).trim();
    }
}
