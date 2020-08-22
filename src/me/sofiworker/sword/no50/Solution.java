package me.sofiworker.sword.no50;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sofiworker
 * @date 2020/8/21
 */
public class Solution {

    public char firstUniqChar(String s){
        if (s == null || s.isEmpty()) {
            return ' ';
        }
        char[] chars = s.toCharArray();
        char[] words = new char[26];
        List<Character> list = new ArrayList<>();
        for (char aChar : chars) {
            if (list.contains(aChar)) {
                list.remove((Character) aChar);
            }else {
                if (words[aChar-'a'] == Character.MIN_VALUE) {
                    list.add(aChar);
                    words[aChar-'a']++;
                }
            }
        }
        if (list.isEmpty()) {
            return ' ';
        }else {
            return list.get(0);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().firstUniqChar("aadadaad"));
    }
}
