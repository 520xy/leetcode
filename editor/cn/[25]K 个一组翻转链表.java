package editor.cn;//给你链表的头节点 head ，每 k 个节点一组进行翻转，请你返回修改后的链表。
//
// k 是一个正整数，它的值小于或等于链表的长度。如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。 
//
// 你不能只是单纯的改变节点内部的值，而是需要实际进行节点交换。 
//
// 
//
// 示例 1： 
// 
// 
//输入：head = [1,2,3,4,5], k = 2
//输出：[2,1,4,3,5]
// 
//
// 示例 2： 
//
// 
//
// 
//输入：head = [1,2,3,4,5], k = 3
//输出：[3,2,1,4,5]
// 
//
// 
//提示：
//
// 
// 链表中的节点数目为 n 
// 1 <= k <= n <= 5000 
// 0 <= Node.val <= 1000 
// 
//
// 
//
// 进阶：你可以设计一个只用 O(1) 额外内存空间的算法解决此问题吗？ 
//
// 
// 
//
// Related Topics 递归 链表 👍 1920 👎 0


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
//    public ListNode reverseKGroup(ListNode head, int k) {
//        //定义预先指针
//        ListNode node =new ListNode(k,head);
//        //调用递归函数
//        recursion(node,k);
//        //返回结果
//        return node.next;
//    }
//
//    public static void recursion(ListNode node,int k){
//        //递归出口
//        if(node==null)return;
//        //获取头部节点前一个位置
//        ListNode pre=node;
//        //准备获取最后一个节点
//        ListNode point=node;
//        //获取第二个节点(这个节点之后会被调在前面，作为下一个递归函数的头部节点前一个位置)
//        node=node.next;
//        //获取当前区间最后一个节点
//        for (int i = 0; i < k; i++) {
//             point=point.next;
//             //如果没有那么多节点就不用反转了直接return即可
//            if(point==null)return;
//        }
//        //把前面的节点调到后面
//        for (int i = 0; i < k-1; i++) {
//            //pre->temp->...->point->point.next(1,2,3,...,4,5,...)
//            //获取头部节点2
//            ListNode temp=pre.next;
//            //1指向3
//            pre.next=temp.next;
//            //2指向5
//            temp.next=point.next;
//            //4指向2
//            point.next=temp;
//        }
//        //继续反转
//        recursion(node,k);
//    }
//
//}
//leetcode submit region end(Prohibit modification and deletion)
