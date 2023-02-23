package editor.cn;//给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
//
// 
//
// 示例 1： 
// 
// 
//输入：head = [1,2,3,4]
//输出：[2,1,4,3]
// 
//
// 示例 2： 
//
// 
//输入：head = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：head = [1]
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点的数目在范围 [0, 100] 内 
// 0 <= Node.val <= 100 
// 
//
// Related Topics 递归 链表 👍 1724 👎 0


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
//    public ListNode swapPairs(ListNode head) {
//        //对head进行简单判断，如果head为null直接返回即可
//        if(head==null)return null;
//        //定义预先指针
//        ListNode result=new ListNode(0,head);
//        //复制预先指针，用于帮助换位，此指针需要移动
//        ListNode temp=result;
//        //开始循环，这里head需要判断是否为null，因为经历循环之后head可能为null
//        while (head!=null&&head.next!=null) {
//            //temp->head->head.next->head.next.next(1->2->3->4)
//            //把1指向3
//            temp.next=temp.next.next;
//            //2指向4
//            head.next=head.next.next;
//            //3指向2
//            temp.next.next=head;
//            //现在顺序为（temp->temp.next->head->head.next(1->3->2->4)）
//            //把1移动到2
//            temp=temp.next.next;
//            //把2移动到4，进入下一次循环
//            head=head.next;
//        }
//        //返回结果即可。
//        return result.next;
//    }
//}
//leetcode submit region end(Prohibit modification and deletion)
