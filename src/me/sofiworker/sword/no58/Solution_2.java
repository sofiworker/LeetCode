package me.sofiworker.sword.no58;

/**
 * @author sofiworker
 * @date 2020/8/13
 */
public class Solution_2 {

    public String reverseLeftWords(String s, int n) {
        String start = s.substring(0, n);
        String end = s.substring(n);
        return end + start;
    }

    public String reverseLeftWords1(String s, int n) {
        return (s + s).substring(n, s.length());
    }
}
