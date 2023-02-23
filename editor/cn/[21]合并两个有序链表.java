package editor.cn;//将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
//
// 
//
// 示例 1： 
// 
// 
//输入：l1 = [1,2,4], l2 = [1,3,4]
//输出：[1,1,2,3,4,4]
// 
//
// 示例 2： 
//
// 
//输入：l1 = [], l2 = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：l1 = [], l2 = [0]
//输出：[0]
// 
//
// 
//
// 提示： 
//
// 
// 两个链表的节点数目范围是 [0, 50] 
// -100 <= Node.val <= 100 
// l1 和 l2 均按 非递减顺序 排列 
// 
//
// Related Topics 递归 链表 👍 2928 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//class Solution {
//    //借鉴了并归排序
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        //定义头指针（预先指针）
//        ListNode result = new ListNode(0);
//        //定义用使用的指针
//        ListNode temp = result;
//        //开始打比赛，小的放前面，直到一条链空了
//        while (list1 != null && list2 != null) {
//            if (list2.val >= list1.val) {
//                //list2.val>=list.val存入较小值
//                temp.next = new ListNode(list1.val);
//                //结果指针向前
//                temp=temp.next;
//                //本次使用指针向前
//                list1 = list1.next;
//            } else {
//                //list2.val<list.val存入较大值
//                temp.next = new ListNode(list2.val);
//                //结果指针向前
//                temp=temp.next;
//                //本次使用指针向前
//                list2 = list2.next;
//            }
//        }
//        //如果list1还有剩余直接存入result结果链表即可，此时list1必然为空
//        while (list1!=null){
//            temp.next = new ListNode(list1.val);
//            temp=temp.next;
//            list1 = list1.next;
//        }
//        //如果list2还有剩余直接存入result结果链表即可，此时list2必然为空
//        while (list2!=null){
//            temp.next = new ListNode(list2.val);
//            temp=temp.next;
//            list2 = list2.next;
//        }
//        //根据预先指针返回结果集
//        return result.next;
//    }
//}
//leetcode submit region end(Prohibit modification and deletion)
