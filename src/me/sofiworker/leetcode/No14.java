package me.sofiworker.leetcode;

public class No14 {

    public String longestCommonPrefix(String[] strs) {
        char[][] temp = new char[strs.length][];
        StringBuilder res = new StringBuilder();
        for (int i = 0; i <strs.length; i++) {
            temp[i] = strs[i].toCharArray();
        }
        for (int j=0; ;j++){
            char first = temp[0][j];
            if (Character.isSpaceChar(first)){
                break;
            }
            int count = 0;
            for (char[] chars : temp) {
                if (chars[j] == first) {
                    count++;
                }
            }
            if (count == temp.length-1){
                res.append(first);
            }
        }
        if ("".equals(new String(res))){
            return new String(res);
        }else {
            return "";
        }
    }
}
