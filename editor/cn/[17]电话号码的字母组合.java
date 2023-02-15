package editor.cn;//给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
//
// 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。 
//
// 
//
// 
//
// 示例 1： 
//
// 
//输入：digits = "23"
//输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
// 
//
// 示例 2： 
//
// 
//输入：digits = ""
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：digits = "2"
//输出：["a","b","c"]
// 
//
// 
//
// 提示： 
//
// 
// 0 <= digits.length <= 4 
// digits[i] 是范围 ['2', '9'] 的一个数字。 
// 
//
// Related Topics 哈希表 字符串 回溯 👍 2303 👎 0


import java.util.*;

//leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    //用回溯算法时定义公共变量比较好
//    //定义结果集
//    List<String> list = new ArrayList<>();
//    //定义映射数组
//    String[] strings = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
//    public List<String> letterCombinations(String digits) {
//        if(Objects.equals("",digits))return list;
//        //调用递归函数，path用StringBuilder这样切割效率更高
//        myGet(digits,0,new StringBuilder(""));
//        return list;
//    }
//
//     public void myGet(String digits,int index,StringBuilder path){
//         //递归出口
//        if(digits.length()==path.length()){
//            //收集字符串
//           list.add(path.toString());
//           return;
//       }
//         ///获取对应数子的字符串
//         String temp=strings[digits.charAt(index)-'0'-2];
//        //开始循环
//         for (int i = 0; i <temp.length(); i++) {
//             //这里不能在形参处append好像因为StringBuilder是不会创建新的对象的
//             path.append(temp.charAt(i));
//             myGet(digits, index + 1, path);
//             //回溯
//             path.deleteCharAt(path.length() - 1);
//         }
//
//     }
//}
//leetcode submit region end(Prohibit modification and deletion)
