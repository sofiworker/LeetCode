package me.sofiworker.sword.no62;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author sofiworker
 * @date 2020/8/16
 */
public class Solution {

    public int lastRemaining(int n, int m) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int index = 0;
        while (n > 1) {
            index = (index + m - 1) % n;
            list.remove(index);
            n--;
        }
        return list.get(0);
    }
}
