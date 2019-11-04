package me.sofiworker.leetcode;

/**给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 示例 1:
 * 输入: 123
 * 输出: 321
 * 示例 2:
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * 输入: 120
 * 输出: 21
 * 注意:
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 * Integer.parseInt()如果解析后的字符串结果超[−2e31,  2e31 − 1]会抛异常
 */
public class No7 {

    public static void main(String[] args) {
        new No7().reverse(1534236469);
    }
    public int reverse(int x) {
        String str = String.valueOf(x);
        char[] tempRes = str.toCharArray();
        StringBuilder res = new StringBuilder();
        if (str.length() == 1){
            return x;
        }
        if (tempRes[0] == '-'){
            res.append("-");
            if (tempRes[tempRes.length-1] != '0'){
                for (int i = tempRes.length-1; i>0; i--){
                    res.append(tempRes[i]);
                }
                try {
                    Integer.parseInt(new String(res));
                }catch (Exception e){
                    return 0;
                }
                return Integer.parseInt(new String(res));
            }else {
                for (int i = tempRes.length-2; i>0; i--){
                    res.append(tempRes[i]);
                }
                try {
                    Integer.parseInt(new String(res));
                }catch (Exception e){
                    return 0;
                }
                return Integer.parseInt(new String(res));
            }
        }else {
            if (tempRes[tempRes.length-1] != '0'){
                for (int i = tempRes.length-1; i>=0; i--){
                    res.append(tempRes[i]);
                }
                try {
                    Integer.parseInt(new String(res));
                }catch (Exception e){
                    return 0;
                }
                return Integer.parseInt(new String(res));
            }else {
                for (int i = tempRes.length-2; i>=0; i--){
                    res.append(tempRes[i]);
                }
                try {
                    Integer.parseInt(new String(res));
                }catch (Exception e){
                    return 0;
                }
                return Integer.parseInt(new String(res));
            }
        }
    }
}
