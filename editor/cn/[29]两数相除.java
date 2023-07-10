package editor.cn;//给你两个整数，被除数 a 和除数 b。将两数相除，要求 不使用 乘法、除法和取余运算。
//
// 整数除法应该向零截断，也就是截去（truncate）其小数部分。例如，8.345 将被截断为 8 ，-2.7335 将被截断至 -2 。 
//
// 返回被除数 a 除以除数 b 得到的 商 。
//
// 注意：假设我们的环境只能存储 32 位 有符号整数，其数值范围是 [−2³¹, 231 − 1] 。本题中，如果商 严格大于 231 − 1 ，则返回 2
//31 − 1 ；如果商 严格小于 -2³¹ ，则返回 -2³¹ 。 
//
// 
//
// 示例 1: 
//
// 
//输入: a = 10, b = 3
//输出: 3
//解释: 10/3 = 3.33333.. ，向零截断后得到 3 。 
//
// 示例 2: 
//
// 
//输入: a = 7, b = -3
//输出: -2
//解释: 7/-3 = -2.33333.. ，向零截断后得到 -2 。 
//
// 
//
// 提示： 
//
// 
// -2³¹ <= a, b <= 2³¹ - 1
// b != 0
// 
//
// Related Topics 位运算 数学 👍 1071 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int divide(int a, int b) {
        //先处理特殊情况，不能被abs处理(可能有其余情况但是测试没有准备)
        if (a == Integer.MIN_VALUE && b == -1) return Integer.MAX_VALUE;
        //确定最后的符号
        boolean flag = (a > 0 && b > 0) || (a < 0 && b < 0);
        //记录a可以分解为多少个b
        int result = 0;
        //为什么要变为负数？因为负数的范围比正数大一个。

        a = -Math.abs(a);
        b = -Math.abs(b);
        //a<=b说明b还有余
        while (a <= b) {
            //每次temp都需要用b迭代，所以b不能丢失
            int temp = b;
            //c赋值为1是因为a<=b说明至少有1的冗余就像-3，-2
            int c = 1;
            //如果a-temp <= temp说明temp可以赋值为temp*2，因为c已经有一个了，这个成立就可以至少变成两个
            // 注意这个地方只能写成a-temp <= temp的形式,写成a<=temp<<1会超时，因为2*temp可能越界然后循环条件改变出大问题
            //一定要写成a<=temp<<1也行temp就要用long类型
            while (a-temp <= temp) {
                temp = temp << 1;  //乘2
                c = c << 1; //记录使用的b的个数
            }
            //a越减越大
            a -= temp;
            //为什么要重复累加，因为temp*2的过程中可能包含很多的b
            result += c;
        }

        return flag ? result : -result;
    }
}



//leetcode submit region end(Prohibit modification and deletion)
