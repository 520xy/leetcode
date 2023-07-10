package editor.cn;//给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
//
// 
//
// 示例 1: 
//
// 
//输入: s = "abcabcbb"
//输出: 3 
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
// 
//
// 示例 2: 
//
// 
//输入: s = "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
// 
//
// 示例 3: 
//
// 
//输入: s = "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
// 
//
// 
//
// 提示： 
//
// 
// 0 <= s.length <= 5 * 10⁴ 
// s 由英文字母、数字、符号和空格组成 
// 
//
// Related Topics 哈希表 字符串 滑动窗口 👍 8696 👎 0


//import java.util.HashMap;
//import java.util.IdentityHashMap;
//import java.util.Map;
//import java.util.Objects;

//leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public int lengthOfLongestSubstring(String s) {
//        //不解释
//        if(s==null || Objects.equals(s,""))return 0;
//        if(s.length()==1)return 1;
//        //用于记录已经出现过的字符
//        Map map=new HashMap<Character, Integer>();
//        //head用于记录字符串头部索引，count记录字符串大小，result记录最大字符串
//        int head=0,count=1,result=1;
//        for (int i = 0; i < s.length(); i++) {
//            //这里用i>0是为了把第一个字符放入map集合用于对比
//            if(i>0&&!map.containsKey(s.charAt(i))){
//                count++;
//            }
//            //i>0防止第一个字符进入这里，因为这样找不到字符一定会得到null
//            else if(i>0){
//                //确定头部索引位置，map.get(s.charAt(i))不能直接作为头索引，
//                // 防止txaat(如果遍历到第二个t时跳回第一个t)
//                //这样写相当于固定了head，head不会受head之前的字符影响，相同的字符索都已经更新为最新的
//                head= Math.max((int)map.get(s.charAt(i))+1,head);
//                count=i-head+1;
//            }
//            result=Math.max(result,count);
//            map.put(s.charAt(i),i);
//        }
//
//        return result;
//
//    }
//}
//leetcode submit region end(Prohibit modification and deletion)
