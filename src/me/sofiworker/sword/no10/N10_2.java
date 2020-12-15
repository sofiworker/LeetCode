package me.sofiworker.sword.no10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author sofiworker
 * @date 2020/8/4
 */
public class N10_2 {

    public int numWays(int n) {
        int[] result = new int[101];
        result[0] = 1;
        result[1] = 1;
        result[2] = 2;
        result[3] = 3;
        for (int i = 4; i < result.length; i++) {
            result[i] = result[i-2] + result[i-1];
            if (result[i] > 1000000007) {
                result[i] = result[i] % 1000000007;
            }
        }
        return result[n];
    }


    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        // 添加元素
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        System.out.println("当前 list 内容：" + stringList);
        // 获取某个位置的元素
        System.out.println("获取的第 0 个元素为：" + stringList.get(0));
        // 删除元素
        stringList.remove(0);
        stringList.remove("b");
        System.out.println("删除第 0 个与 \"b\" 后 list 内容：" + stringList);
        // 判断是否包含某个元素
        System.out.println("当前 list 是否包含 \"a\"：" + stringList.contains("a"));

        stringList.add(0, "x");
        System.out.println("排序前 list 内容：" + stringList);
        // 排序
        stringList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("排序后 list 内容：" + stringList);
    }
}
