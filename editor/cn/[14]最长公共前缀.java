package editor.cn;//编写一个函数来查找字符串数组中的最长公共前缀。
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 
//
// 示例 1： 
//
// 
//输入：strs = ["flower","flow","flight"]
//输出："fl"
// 
//
// 示例 2： 
//
// 
//输入：strs = ["dog","racecar","car"]
//输出：""
//解释：输入不存在公共前缀。 
//
// 
//
// 提示： 
//
// 
// 1 <= strs.length <= 200 
// 0 <= strs[i].length <= 200 
// strs[i] 仅由小写英文字母组成 
// 
//
// Related Topics 字典树 字符串 👍 2634 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    //这个比一个一个比较字母效率高（因为算法确实更优）
//    //一个一个比较一般情况下前面几个字符都可以过，但是直接找子串第二个可能就会舍去很多
//    public String longestCommonPrefix(String[] strs) {
//        if (strs.length == 0){
//            return "";
//        }
//        else{
//            //先初始化一个公共串
//            String common_prefix = strs[0];
//            //遍历数组
//            for (String str: strs){
//                //如果公共串不是数组元素的前缀，则公共串-1（返回索引为0，说明是从索引0开始的子串，即为前缀）
//                //indexOf是查找子串
//                while (str.indexOf(common_prefix) != 0) {
//                    common_prefix = common_prefix.substring(0, common_prefix.length() - 1);
//                    //如果公共串减到为""就没有必要继续遍历了
//                    if (common_prefix.isEmpty())
//                        return "";
//                }
//            }
//            return common_prefix;
//        }
//    }
//}

//leetcode submit region end(Prohibit modification and deletion)
