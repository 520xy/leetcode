package editor.cn;//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
//
// 有效字符串需满足： 
//
// 
// 左括号必须用相同类型的右括号闭合。 
// 左括号必须以正确的顺序闭合。 
// 每个右括号都有一个对应的相同类型的左括号。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "()"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：s = "()[]{}"
//输出：true
// 
//
// 示例 3： 
//
// 
//输入：s = "(]"
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 10⁴ 
// s 仅由括号 '()[]{}' 组成 
// 
//
// Related Topics 栈 字符串 👍 3740 👎 0


import java.util.Stack;

//leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    //主要是利用一个栈空间储存'[','{','('。
//    public boolean isValid(String s) {
//        //定义一个栈结构
//        Stack<Character> stack =new Stack<>();
//        //开始遍历字符串
//        for (int i = 0; i < s.length(); i++) {
//            //获取当前索引所在字符
//            char ch= s.charAt(i);
//            //对当前字符进行判断看其是入栈还是对比
//            if(ch=='('||ch=='['||ch=='{')
//                //入栈
//                stack.add(ch);
//            else {
//                //栈空间为空说明没有对应的左符号，符号不闭合
//                if(stack.size()==0)return false;
//                //弹栈
//                char pop = stack.pop();
//                //判断弹出字符是否匹配
//                if((ch==')'&&pop!='(')||(ch==']'&&pop!='[')||ch=='}'&&pop!='{')
//                    return false;
//            }
//        }
//        //遍历完还有剩余说明左符号有剩余，符号不闭合
//        if(stack.size()!=0)
//            return false;
//        else
//            return true;
//    }
//}
//leetcode submit region end(Prohibit modification and deletion)
