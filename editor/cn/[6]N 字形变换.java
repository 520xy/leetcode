package editor.cn;//将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。
//
// 比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下： 
//
// 
//P   A   H   N
//A P L S I I G
//Y   I   R 
//
// 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。 
//
// 请你实现这个将字符串进行指定行数变换的函数： 
//
// 
//string convert(string s, int numRows); 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "PAYPALISHIRING", numRows = 3
//输出："PAHNAPLSIIGYIR"
// 
//
//示例 2：
//
// 
//输入：s = "PAYPALISHIRING", numRows = 4
//输出："PINALSIGYAHRPI"
//解释：
//P     I    N
//A   L S  I G
//Y A   H R
//P     I
// 
//
// 示例 3： 
//
// 
//输入：s = "A", numRows = 1
//输出："A"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// s 由英文字母（小写和大写）、',' 和 '.' 组成 
// 1 <= numRows <= 1000 
// 
//
// Related Topics 字符串 👍 1941 👎 0


import java.lang.reflect.Array;
import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public String convert(String s, int numRows) {
//         if (numRows==1 || s==null|| s.length()<3)return s;
//         //准备numRows的行字符串数组（用于拼接）
//          String[]strings=new String[numRows];
//          //数组初始化
//          Arrays.fill(strings,"");
//          //计算周期长度，v为一个周期（v是图像）
//          int period=2*numRows-2;
//          //把字符串变成字符数组
//        char[] chars = s.toCharArray();
//          //遍历字符数组
//        for (int i = 0; i < chars.length; i++) {
//            //字符索引取余
//            int mod=i%period;
//            //当mod为0时一个周期开始了
//            if(mod<numRows)
//                //把一段连续长为numRows字符均匀分在每个待拼接的字符串中
//                strings[mod]+=chars[i];
//            else
//                //在一个周期之内超过strings索引，字符从字符串数组后面往前加
//                strings[period-mod]+=chars[i];
//        }
//        //字符串数组就是每行字符串，拼接返回即可
//        String string="";
//        for (int i = 0; i < strings.length; i++) {
//            string+=strings[i];
//        }
//
//        return string;
//    }
//}
//leetcode submit region end(Prohibit modification and deletion)
