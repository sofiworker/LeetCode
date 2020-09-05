package me.sofiworker.top100.no55;

/**
 * @author sofiworker
 * @date 2020/9/5
 */
public class Solution {

    /**
     * 主要数组中不出现 0，则一定能以一步一步的跳到最后，所以只需要判断跳跃到数组中 0 时，是否能跳过 0 这个点
     */
    public boolean canJump(int[] nums) {
        if(nums == null|| nums.length == 0) {
            return false;
        }
        if(nums.length == 1) {
            return true;
        }
        for(int i = 0; i < nums.length - 1; i++){
            //最后一个位置的数不管，否则最后为0影响判断
            if(nums[i] == 0){
                int j = i;
                // 表示 j 后退的距离的长度
                int count = 0;
                // 判断 j 位置所在的数的值是否能跳过 0 点
                while(nums[j] <= count){
                    j--; count++;
                    if(j < 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
