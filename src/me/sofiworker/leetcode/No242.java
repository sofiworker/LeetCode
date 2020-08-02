package me.sofiworker.leetcode;

import java.util.Arrays;

/**
 * @author sofiworker
 * @version 1.0.0
 * @date 2020/4/6 20:05
 * @description
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * 示例 1:
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 *
 * 示例 2:
 * 输入: s = "rat", t = "car"
 * 输出: false
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-anagram
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class No242 {

    static class Solution {

        public boolean isAnagram(String s, String t) {
            char[] a = s.toCharArray();
            char[] b = t.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            String s1 = String.valueOf(a);
            String s2 = String.valueOf(b);
            return s1.equals(s2);
        }
    }
}
