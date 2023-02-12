package editor.cn;//请你来实现一个 myAtoi(string s) 函数，使其能将字符串转换成一个 32 位有符号整数（类似 C/C++ 中的 atoi 函数）。
//
// 函数 myAtoi(string s) 的算法如下： 
//
// 
// 读入字符串并丢弃无用的前导空格 
// 检查下一个字符（假设还未到字符末尾）为正还是负号，读取该字符（如果有）。 确定最终结果是负数还是正数。 如果两者都不存在，则假定结果为正。 
// 读入下一个字符，直到到达下一个非数字字符或到达输入的结尾。字符串的其余部分将被忽略。 
// 将前面步骤读入的这些数字转换为整数（即，"123" -> 123， "0032" -> 32）。如果没有读入数字，则整数为 0 。必要时更改符号（从步骤 
//2 开始）。 
// 如果整数数超过 32 位有符号整数范围 [−2³¹, 231 − 1] ，需要截断这个整数，使其保持在这个范围内。具体来说，小于 −2³¹ 的整数应该被固
//定为 −2³¹ ，大于 231 − 1 的整数应该被固定为 231 − 1 。 
// 返回整数作为最终结果。 
// 
//
// 注意： 
//
// 
// 本题中的空白字符只包括空格字符 ' ' 。 
// 除前导空格或数字后的其余字符串外，请勿忽略 任何其他字符。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "42"
//输出：42
//解释：加粗的字符串为已经读入的字符，插入符号是当前读取的字符。
//第 1 步："42"（当前没有读入字符，因为没有前导空格）
//         ^
//第 2 步："42"（当前没有读入字符，因为这里不存在 '-' 或者 '+'）
//         ^
//第 3 步："42"（读入 "42"）
//           ^
//解析得到整数 42 。
//由于 "42" 在范围 [-2³¹, 2³¹ - 1] 内，最终结果为 42 。 
//
// 示例 2： 
//
// 
//输入：s = "   -42"
//输出：-42
//解释：
//第 1 步："   -42"（读入前导空格，但忽视掉）
//            ^
//第 2 步："   -42"（读入 '-' 字符，所以结果应该是负数）
//             ^
//第 3 步："   -42"（读入 "42"）
//               ^
//解析得到整数 -42 。
//由于 "-42" 在范围 [-2³¹, 2³¹ - 1] 内，最终结果为 -42 。
// 
//
// 示例 3： 
//
// 
//输入：s = "4193 with words"
//输出：4193
//解释：
//第 1 步："4193 with words"（当前没有读入字符，因为没有前导空格）
//         ^
//第 2 步："4193 with words"（当前没有读入字符，因为这里不存在 '-' 或者 '+'）
//         ^
//第 3 步："4193 with words"（读入 "4193"；由于下一个字符不是一个数字，所以读入停止）
//             ^
//解析得到整数 4193 。
//由于 "4193" 在范围 [-2³¹, 2³¹ - 1] 内，最终结果为 4193 。
// 
//
// 
//
// 提示： 
//
// 
// 0 <= s.length <= 200 
// s 由英文字母（大写和小写）、数字（0-9）、' '、'+'、'-' 和 '.' 组成 
// 
//
// Related Topics 字符串 👍 1604 👎 0


import java.util.regex.*;

//leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public int myAtoi(String str) {
//        if(str==null||str.equals("")) return 0;
//        //去除原始字符串前后空格
//        str=str.trim();
//        //用于记录是否为负数（假定的不是）
//        boolean isNega=false;
//        if(str.length()>=1&&(str.charAt(0)=='-'||str.charAt(0)=='+')){
//            //是负数就改变isNega的值，改为true
//            isNega=str.charAt(0)=='-';
//            //确定有符号+，-就截取掉
//            str=str.substring(1,str.length());
//        }
//        //截掉符号后，如果为""或者第一个数字不是数字字符，说明前缀不是数字直接return 0即可
//        if(str.length()<1||'0'>str.charAt(0)||str.charAt(0)>'9') return 0;
//        //i是用于循环计数取字符，ans是结果
//        int i=0,ans=0;
//        //如果没有遍历完字符串，且连续的字符串都是数字（后面不是数字的不管）
//        while(i<str.length()&&'0'<=str.charAt(i)&&str.charAt(i)<='9'){
//            //字符变数字,这里是正数（从左到右看）
//            int temp=str.charAt(i)-'0';
//            //因为确定了符号看截取的数字需不需要*-1改变符号（每个数字都要用一次，保证负数永远加负数）
//            if(isNega) temp*=-1;
//            //ans先判断再加也是为了不越界，否则要用long（感觉用long判断条件不用这么麻烦，可以先算再判断，这样就不用思考小细节了）
//            //这里的判断条件更精确，ans>Integer.MAX_VALUE/10，ans和Integer.MAX_VALUE/10都是整数，ans至少大1，所以*10就至少大10比7大
//    //ans==Integer.MAX_VALUE/10&&temp > 7，Integer.MAX_VALUE的个位数是7，如果temp大于7那么ans*10+temp必定大于Integer.MAX_VALUE
//            if(ans>Integer.MAX_VALUE/10||(ans==Integer.MAX_VALUE/10&&temp > 7)){
//                return Integer.MAX_VALUE;
//            }
//            //Integer.MIN_VALUE个位是-8，如果temp小于-8那么ans*10+temp必定小于Integer.MIN_VALUE
//            if(ans<Integer.MIN_VALUE/10||(ans==Integer.MIN_VALUE/10&&temp <-8)){
//                return Integer.MIN_VALUE;
//            }
//            //判断完了没有返回，就直接+即可
//            ans=ans*10+temp;
//            //进入下一个字符进行判断
//            i++;
//        }
//        //返回结果
//        return ans;
//
//    }
//}

//leetcode submit region end(Prohibit modification and deletion)
