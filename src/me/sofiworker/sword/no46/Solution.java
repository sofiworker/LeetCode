package me.sofiworker.sword.no46;

/**
 * @author sofiworker
 * @date 2020/9/3
 */
public class Solution {

    public int translateNum(int num) {
        String value = String.valueOf(num);
        if (value.length() == 1) {
            return 1;
        }
        int[] res = new int[value.length()];
        res[0] = 1;
        char[] chars = value.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            int anInt = Integer.parseInt(String.valueOf(chars[i-1]) + String.valueOf(chars[i]));
            if (anInt >=0 && anInt <= 25) {
                res[i] = res[i-1] + res[i-2];
            }else {
                res[i] = res[i-1];
            }
        }
        return res[res.length-1];
    }

    public static void main(String[] args) {
        System.out.println(new Solution().translateNum(12258));
    }
}
