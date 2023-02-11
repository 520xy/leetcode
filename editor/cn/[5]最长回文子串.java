package editor.cn;//给你一个字符串 s，找到 s 中最长的回文子串。
//
// 如果字符串的反序与原始字符串相同，则该字符串称为回文字符串。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "babad"
//输出："bab"
//解释："aba" 同样是符合题意的答案。
// 
//
// 示例 2： 
//
// 
//输入：s = "cbbd"
//输出："bb"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// s 仅由数字和英文字母组成 
// 
//
// Related Topics 字符串 动态规划 👍 6125 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    //动态规划o（n²）
//    public String longestPalindrome(String s) {
//        //最长串首位索引和大小
//        int head=0,tail=0,result=0;
//        if(s==null || s.length() < 2)return s;
//        //dp[i][j]表示以s[i,j]是否为回文子串
//        //递推公式s[i]==s[j]且dp[i+1][j-1]==true  ==>dp[i][j]=true
//        boolean [][]dp= new boolean[s.length()][s.length()];
//        //根据递推公式需要依赖i+1行和j-1列（这个依赖决定遍历方向）
//        for (int i = s.length()-1 ; i >=0; i--) {
//            for (int j = i; j < s.length(); j++) {
//                    if(s.charAt(i)==s.charAt(j)&&(j-i<=1 || dp[i+1][j-1]==true)) {
//                        if(j-i+1>=result)
//                        {
//                            head=i;
//                            tail=j;
//                            result=j-i+1;
//                        }
//                        dp[i][j]=true;
//                        continue;
//                    }
//                    dp[i][j]=false;
//            }
//        }
//        return s.substring(head,tail+1);
//
//
//    }
//}
//leetcode submit region end(Prohibit modification and deletion)
