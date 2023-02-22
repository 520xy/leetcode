package editor.cn;//给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
//
// 
//
// 示例 1： 
// 
// 
//输入：head = [1,2,3,4,5], n = 2
//输出：[1,2,3,5]
// 
//
// 示例 2： 
//
// 
//输入：head = [1], n = 1
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：head = [1,2], n = 1
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 链表中结点的数目为 sz 
// 1 <= sz <= 30 
// 0 <= Node.val <= 100 
// 1 <= n <= sz 
// 
//
// 
//
// 进阶：你能尝试使用一趟扫描实现吗？ 
//
// Related Topics 链表 双指针 👍 2413 👎 0


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
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        //简单进行返回判断
//        if (head == null) return null;
//        //准备两个指针temp是慢指针，result是结果（head默认为快指针）
//        ListNode temp = head;
//        ListNode result = head;
//        //首先把head移动n位
//        for (; n > 0; n--)
//            head = head.next;
//        //如果head==null说明删除的就是第一个数据
//        if(head==null)return result.next;
//        //开始移动temp指针，当head.next==null时，temp.next就是倒数第n个指针
//        while (head.next != null) {
//            temp = temp.next;
//            head = head.next;
//        }
//        //删除倒数第n个指针
//        temp.next=temp.next.next;
//        return result;
//    }
//}
//leetcode submit region end(Prohibit modification and deletion)
