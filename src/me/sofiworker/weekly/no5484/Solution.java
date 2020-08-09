package me.sofiworker.weekly.no5484;

/**
 * @author sofiworker
 * @date 2020/8/9
 */
public class Solution {

    public static void main(String[] args) {
        new Solution().findKthBit(3, 1);
    }

    public char findKthBit(int n, int k) {

        String[] str = new String[n];
        str[0] = "0";
        for (int i = 1; i < n; i++) {
            str[i] = str[i-1] + "1" + reverse(invert(str[i-1]));
        }
        return str[n-1].toCharArray()[k-1];
    }

    public String invert(String s) {
        char[] res = new char[s.length()];
        int index = 0;
        for (char c : s.toCharArray()) {
            res[index++] = c == '0' ? '1' : '0';
        }
        return new String(res);
    }

    public String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
