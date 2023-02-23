package editor.cn;//数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
//
// 
//
// 示例 1： 
//
// 
//输入：n = 3
//输出：["((()))","(()())","(())()","()(())","()()()"]
// 
//
// 示例 2： 
//
// 
//输入：n = 1
//输出：["()"]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 8 
// 
//
// Related Topics 字符串 动态规划 回溯 👍 3091 👎 0


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    //定义静态集合
//     private static List<String> result = new ArrayList<>();
//    public List<String> generateParenthesis(int n) {
//        //每次调用函数先把静态集合清空，否则会因为遗留数据导致结果不准确
//        result.clear();
//        //调用递归函数传入n，n，""表示n个'(',')',和初始字符串
//        recursion(n,n,"");
//        return result;
//    }
//    //n表示剩余几个'('.m表示剩余几个')'
//    public static void recursion(int n,int m ,String s) {
//        //当'('和')'都为0时表示字符串已经拼接完成
//        if (n == 0 && m==0) {
//            //收集结果
//         result.add(s);
//          return;
//        }
//        //先全部放'('
//        if(n<=m&&n>0) recursion(n-1,m,s+"(");
//        //如果'）'过少就不用进行了，肯定不对
//        if(n<m&&m>0) recursion(n,m-1,s+")");
//    }
//
//}
//leetcode submit region end(Prohibit modification and deletion)
