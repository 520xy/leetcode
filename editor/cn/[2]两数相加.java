package editor.cn;//给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
//
// 请你将两个数相加，并以相同形式返回一个表示和的链表。 
//
// 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 
//
// 示例 1： 
// 
// 
//输入：l1 = [2,4,3], l2 = [5,6,4]
//输出：[7,0,8]
//解释：342 + 465 = 807.
// 
//
// 示例 2： 
//
// 
//输入：l1 = [0], l2 = [0]
//输出：[0]
// 
//
// 示例 3： 
//
// 
//输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//输出：[8,9,9,9,0,0,0,1]
// 
//
// 
//
// 提示： 
//
// 
// 每个链表中的节点数在范围 [1, 100] 内 
// 0 <= Node.val <= 9 
// 题目数据保证列表表示的数字不含前导零 
// 
//
// Related Topics 递归 链表 数学 👍 9181 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

// Definition for singly-linked list.
// public class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }

//class Solution {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//          //双指针pre表示预先指针，相当于头节点不动，post是防止l1==null时找不到指向l1的指针
//          ListNode pre=new ListNode(0,l1);
//          ListNode post=pre;
//          int decade=0;
//          while (l1!=null || l2!=null) {
//              int numl1 = l1 == null ? 0 : l1.val;
//              int numl2 = l2 == null ? 0 : l2.val;
//              //这里是最垃圾的地方，这个decade需要用本次的来判断是否-10，但是加还是要用上次的decade
//              //所以这个c就是保存上次的decade
//              int c=decade;
//              decade = (numl1 + numl2+decade) / 10;
//              if (l1 != null) {
//                  l1.val = (decade == 1) ? (numl1 + numl2+c - 10) : (numl1 + numl2+c);
//              } else {
//                  post.next = new ListNode(decade == 1 ? (numl1 + numl2+c - 10) : (numl1 + numl2+c), null);
//                  l1 = post.next;
//              }
//              post = post.next;
//              l1 = l1.next;
//              if(l2!=null)
//              l2=l2.next;
//          }
//          //最后这里可能也需要一个进位
//          if(decade!=0)
//              post.next = new ListNode(1, null);
//     return pre.next;
//    }
//}
//leetcode submit region end(Prohibit modification and deletion)
