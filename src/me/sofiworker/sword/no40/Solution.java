package me.sofiworker.sword.no40;

import java.util.Arrays;

/**
 * @author sofiworker
 * @date 2020/8/27
 */
public class Solution {

    public int[] getLeastNumbers(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }
        if (k == 0) {
            return new int[0];
        }
        Arrays.sort(arr);
        return Arrays.copyOf(arr, k);
    }

    public int[] getLeastNumbers1(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }
        if (k == 0) {
            return new int[0];
        }
        quickSort(arr, 0, arr.length - 1);
        return Arrays.copyOf(arr, k);
    }

    public void quickSort(int[] a, int left, int right) {
        //左下标
        int l = left;
        //右下标
        int r = right;
        // pivot 中轴值
        int pivot = a[(left + right) / 2];
        int temp;
        // 循环的目的是让比 pivot 小的值放到左边
        while (l < r) {
            // 在pivot左边找到大于等于pivot的值才退出
            while (a[l] < pivot) {
                l++;
            }

            while (a[r] > pivot) {
                r--;
            }
            if (l >= r) {
                break;
            }

            temp = a[l];
            a[l] = a[r];
            a[r] = temp;

            // 交换完成后，a[l] == pivot 相等则 r--
            if (a[l] == pivot) {
                r--;
            }
            if (a[r] == pivot) {
                l++;
            }
        }

        // 防止栈溢出
        if (l == r) {
            l += 1;
            r -= 1;
        }

        // 向左递归
        if (left < r) {
            quickSort(a, left, r);
        }

        //向右递归
        if (right > l) {
            quickSort(a, l, right);
        }

    }
}
