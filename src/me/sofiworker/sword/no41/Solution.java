package me.sofiworker.sword.no41;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author sofiworker
 * @date 2020/12/1
 */
public class Solution {

    class MedianFinder {

        private List<Integer> dataList;

        /** initialize your data structure here. */
        public MedianFinder() {
            dataList = new ArrayList<>();
        }

        public void addNum(int num) {
            dataList.add(num);
        }

        public double findMedian() {
            if (dataList.isEmpty()) {
                return 0;
            }
            if (dataList.size() == 1) {
                return dataList.get(0);
            }
            dataList.sort(Comparator.comparingInt(o -> o));
            if (dataList.size() % 2 == 1) {
                return dataList.get((int)Math.round(dataList.size() / 2.0) - 1);
            }else {
                int midIndex  = dataList.size() / 2;
                return (dataList.get(midIndex) + dataList.get(midIndex - 1)) / 2.0;
            }
        }
    }
}
