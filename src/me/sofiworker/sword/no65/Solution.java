package me.sofiworker.sword.no65;

/**
 * @author sofiworker
 * @date 2020/8/13
 */
public class Solution {

    public int add(int a, int b) {
        if (b == 0) {
            return a;
        }

        // 转换成非进位和 + 进位
        return add(a ^ b, (a & b) << 1);
    }
}
