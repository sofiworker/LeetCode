package me.sofiworker.leetcode.no14;

/**
 * @author sofiworker
 * @date 2020/8/5
 */
public class Solution {

    public String longestCommonPrefix(String[] strs) {
        char[][] chars = new char[strs.length][];
        int minLen = 0;
        for (int i = 0; i < strs.length; i++) {
            if ("".equals(strs[i])) {
                return "";
            }
            char[] chars1 = strs[i].toCharArray();
            int rowLen = chars1.length;
            chars[i] = new char[rowLen];
            System.arraycopy(chars1, 0, chars[i], 0, rowLen);
            if (minLen == 0) {
                minLen = rowLen;
            }else if (minLen > rowLen) {
                minLen = rowLen;
            }
        }
        StringBuilder sb = new StringBuilder();
        int index = 1;
        for (int j = 0; j < minLen; j++) {
            int count = 0;
            for (int i = 0; i < chars.length - 1; i++) {
                if (chars[i][j] == chars[i+1][j]) {
                    count++;
                }else {
                    break;
                }
            }
            if (count == chars.length - 1 && index - j == 1) {
                sb.append(chars[0][j]);
                index++;
            }
        }
        String s = new String(sb);
        if ("".equals(s)) {
            return "";
        }else {
            return s;
        }
    }

//    public String longestCommonPrefix(String[] strs) {
//        String pre = "";
//        if(strs.length==0){
//            return "";
//        }
//        if (strs.length==1){
//            return strs[0];
//        }
//        pre = help(strs[0],strs[1]);
//        if(pre==null){
//            return "";
//        }
//        for (int i = 2; i < strs.length; i++) {
//            pre = help(pre,strs[i]);
//            if(pre==null){
//                return "";
//            }
//        }
//        return pre;
//    }
//    private String help(String s1,String s2){
//        int len = Math.min(s1.length(),s2.length());
//        for (int i = len; i > 0; i--) {
//            String t = s1.substring(0,i);
//            if (t.equals(s2.substring(0,i))){
//                return t;
//            }
//        }
//        return null;
//    }

    public static void main(String[] args) {
        System.out.println(new Solution().longestCommonPrefix(new String[]{"aca","cba"}));
    }
}
