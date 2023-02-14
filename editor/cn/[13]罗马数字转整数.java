package editor.cn;//罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
//
// 
//字符          数值
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000 
//
// 例如， 罗马数字 2 写做 II ，即为两个并列的 1 。12 写做 XII ，即为 X + II 。 27 写做 XXVII, 即为 XX + V + 
//II 。 
//
// 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5
// 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况： 
//
// 
// I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。 
// X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
// C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。 
// 
//
// 给定一个罗马数字，将其转换成整数。 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "III"
//输出: 3 
//
// 示例 2: 
//
// 
//输入: s = "IV"
//输出: 4 
//
// 示例 3: 
//
// 
//输入: s = "IX"
//输出: 9 
//
// 示例 4: 
//
// 
//输入: s = "LVIII"
//输出: 58
//解释: L = 50, V= 5, III = 3.
// 
//
// 示例 5: 
//
// 
//输入: s = "MCMXCIV"
//输出: 1994
//解释: M = 1000, CM = 900, XC = 90, IV = 4. 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 15 
// s 仅含字符 ('I', 'V', 'X', 'L', 'C', 'D', 'M') 
// 题目数据保证 s 是一个有效的罗马数字，且表示整数在范围 [1, 3999] 内 
// 题目所给测试用例皆符合罗马数字书写规则，不会出现跨位等情况。 
// IL 和 IM 这样的例子并不符合题目要求，49 应该写作 XLIX，999 应该写作 CMXCIX 。 
// 关于罗马数字的详尽书写规则，可以参考 罗马数字 - Mathematics 。 
// 
//
// Related Topics 哈希表 数学 字符串 👍 2241 👎 0


import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    //我的做法不是最优，最优的在下面
//    public int romanToInt(String s) {
//        //定义一个HashMap数组，本来定义的是HashTable但是好像有错误
//        Map hashtable = new HashMap<Character, Integer>();
//        //进行单个初始化即可（其余的如CM之类的在下面会单独给出的）
//        hashtable.put('M',1000);
//        hashtable.put('D',500);
//        hashtable.put('C',100);
//        hashtable.put('L',50);
//        hashtable.put('X',10);
//        hashtable.put('V',5);
//        hashtable.put('I',1);
//        //定义返回值
//           int sum=0;
//           //遍历罗马字符串
//           for(int i=0;i<s.length();i++) {
//               //获取第一个字母
//               char temp = s.charAt(i);
//               //对第二个字母进行判断，看其是否是是特殊的两个字符
//               if(i+1<s.length()&&temp=='C')
//               {
//                   //这里之所以只+1因为结束的时候会自动+1
//                   if(s.charAt(i+1)=='M'){
//                       sum+=900;
//                       i++;
//                   }
//                   else if(s.charAt(i+1)=='D'){
//                       sum+=400;
//                       i++;
//                   }
//                   else
//                       sum+=100;
//               }
//               else if(i+1<s.length()&&temp=='X'){
//                   if(s.charAt(i+1)=='C'){
//                       sum+=90;
//                       i++;
//                   }
//                   else if(s.charAt(i+1)=='L'){
//                       sum+=40;
//                       i++;
//                   }
//                   else
//                       sum+=10;
//
//               } else if(i+1<s.length()&&temp=='I'){
//                   if(s.charAt(i+1)=='X'){
//                       sum+=9;
//                       i++;
//                   }
//                   else if(s.charAt(i+1)=='V'){
//                       sum+=4;
//                       i++;
//                   }
//                   else
//                       sum+=1;
//               }
//               else
//                   //走完双字符逻辑，进入这里
//                   sum += (int)hashtable.get(temp);
//           }
//        return sum;
//    }
//}
//


////import java.util.*;
////
////class Solution {
////    //这个做法是最优的
////    public int romanToInt(String s) {
////        int sum = 0;
////        //preNum进行初始化
////        int preNum = getValue(s.charAt(0));
////        for(int i = 1;i < s.length(); i ++) {
////            int num = getValue(s.charAt(i));
////            //这里巧妙的把特殊双字符处理了，双字符的关系是大-小
////            //第一次把小的减去，第二次加上大的
////            if(preNum < num) {
////                sum -= preNum;
////            } else {
////                sum += preNum;
////            }
////            preNum = num;
////        }
////        //因为i从i开始所有最后一次需要手动执行（最后一次一定为加）
////        sum += preNum;
////        return sum;
////    }
////    //此函数用于获取单个字符的值，比较字符的大小
////    private int getValue(char ch) {
////        switch(ch) {
////            case 'I': return 1;
////            case 'V': return 5;
////            case 'X': return 10;
////            case 'L': return 50;
////            case 'C': return 100;
////            case 'D': return 500;
////            case 'M': return 1000;
////            default: return 0;
////        }
////    }
////}

//leetcode submit region end(Prohibit modification and deletion)
