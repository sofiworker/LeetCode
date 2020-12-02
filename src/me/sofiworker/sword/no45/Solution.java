package me.sofiworker.sword.no45;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author sofiworker
 * @date 2020/12/1
 */
public class Solution {

    public String minNumber(int[] nums) {
        return Arrays.stream(nums).mapToObj(value -> ""+value).sorted((o1, o2) -> (o1 + o2).compareTo(o2 + o1)).collect(Collectors.joining());
    }
}
