package editor.cn;//给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
//
// 如果反转后整数超过 32 位的有符号整数的范围 [−2³¹, 231 − 1] ，就返回 0。 
//假设环境不允许存储 64 位整数（有符号或无符号）。
//
// 
//
// 示例 1： 
//
// 
//输入：x = 123
//输出：321
// 
//
// 示例 2： 
//
// 
//输入：x = -123
//输出：-321
// 
//
// 示例 3： 
//
// 
//输入：x = 120
//输出：21
// 
//
// 示例 4： 
//
// 
//输入：x = 0
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// -2³¹ <= x <= 2³¹ - 1 
// 
//
// Related Topics 数学 👍 3754 👎 0


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public int reverse(int x) {
//        //准备接反转的数
//        int ans = 0;
//
//        while (x != 0) {
//            //不停取个位拼给ans
//            //余数也可以取负数
//            //这里是先取后除
//            int pop = x % 10;
//      //为什么要/10，ans有范围限制写成ans*10+pop>Integer.MAX_VALUE如果超过Integer.MAX_VALUE就会乱数
//            //不这么写也行但是ans就不要定义成int，需要定义成long
//            if (ans > Integer.MAX_VALUE/10  )
//                return 0;
//            if (ans< Integer.MIN_VALUE/10  )
//                return 0;
//            //这里写在下面就是怕超过Integer.MAX_VALUE的范围，所以根据技巧先判断在加
//            ans = ans * 10 + pop;
//            //个位变十位，把新的个位加进来
//            x /= 10;
//        }
//        return ans;
//    }
//}

//leetcode submit region end(Prohibit modification and deletion)
