package editor.cn;//给你一个链表数组，每个链表都已经按升序排列。
//
// 请你将所有链表合并到一个升序链表中，返回合并后的链表。 
//
// 
//
// 示例 1： 
//
// 输入：lists = [[1,4,5],[1,3,4],[2,6]]
//输出：[1,1,2,3,4,4,5,6]
//解释：链表数组如下：
//[
//  1->4->5,
//  1->3->4,
//  2->6
//]
//将它们合并到一个有序链表中得到。
//1->1->2->3->4->4->5->6
// 
//
// 示例 2： 
//
// 输入：lists = []
//输出：[]
// 
//
// 示例 3： 
//
// 输入：lists = [[]]
//输出：[]
// 
//
// 
//
// 提示： 
//
// 
// k == lists.length 
// 0 <= k <= 10^4 
// 0 <= lists[i].length <= 500 
// -10^4 <= lists[i][j] <= 10^4 
// lists[i] 按 升序 排列 
// lists[i].length 的总和不超过 10^4 
// 
//
// Related Topics 链表 分治 堆（优先队列） 归并排序 👍 2337 👎 0


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
//    //这是主函数，这道题主要思想是归并排序
//    public ListNode mergeKLists(ListNode[] lists) {
//        //如果集合为空直接return null即可
//        if(lists==null||lists.length==0)return null;
//        //开始调用归并排序，传入集合，左索引，右索引
//        return splitCollect(lists,0,lists.length-1);
//    }
//        //这个函数用于合并两个链表，是21题代码只加了两行判断传入为空的代码
//        public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        if(list1==null) {
//            return list2;
//        }
//        if(list2==null){
//            return list1;
//        }
//
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
//    //此函数用于分治
//    public static ListNode splitCollect(ListNode[] lists,int left,int right) {
//        //如果left<right说明仍然可以治
//        if(left<right){
//            //取索引中间值
//            int mid=(left+right)/2;
//            //对左边进行分治
//            ListNode l1=splitCollect(lists,left,mid);
//            //对右边进行分治
//            ListNode l2=splitCollect(lists,mid+1,right);
//            //返回分治出的两个链表和
//            return mergeTwoLists(l1,l2);
//        }
//        //如果left<list.length说明没有超过索引范围，left==right(下面写了right)
//        if(right<lists.length){
//            //取对应链表去打擂台
//            return lists[right];
//        }
//        else{
//            //超过索引范围直接返回null即可，聚合函数会处理的。
//            return null;
//        }
//    }
//
//}
//leetcode submit region end(Prohibit modification and deletion)
