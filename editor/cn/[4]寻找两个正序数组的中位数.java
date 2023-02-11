package editor.cn;//给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
//
// 算法的时间复杂度应该为 O(log (m+n)) 。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums1 = [1,3], nums2 = [2]
//输出：2.00000
//解释：合并数组 = [1,2,3] ，中位数 2
// 
//
// 示例 2： 
//
// 
//输入：nums1 = [1,2], nums2 = [3,4]
//输出：2.50000
//解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
// 
//
// 
//
// 
//
// 提示： 
//
// 
// nums1.length == m 
// nums2.length == n 
// 0 <= m <= 1000 
// 0 <= n <= 1000 
// 1 <= m + n <= 2000 
// -10⁶ <= nums1[i], nums2[i] <= 10⁶ 
// 
//
// Related Topics 数组 二分查找 分治 👍 6255 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        if(nums1==null && nums2==null)
//        {
//            return 0;
//        }
//        else if ((nums1==null && nums2!=null)||(nums1!=null && nums2==null))
//        {
//            int[] nums= nums1==null? nums2 : nums1;
//            if(nums.length%2==0)
//                return (nums[nums.length/2]+nums[nums.length/2-1])/2.0;
//            else
//                return nums[nums.length/2];
//        }
//        else {
//            //求两数组总长
//            int m = nums1.length;
//            int n = nums2.length;
//            int len = m + n;
//            //定义变量获取left=左mid，right=右mid,是否用左mid要看奇偶
//            int left = -1, right = -1;
//            //记录两个数组的索引在何处
//            int num1Start = 0, nums2Start = 0;
//            //直接遍历一半（反正只要一半）
//            for (int i = 0; i <= len / 2; i++) {
//                //右覆盖左，最后一次遍历右边覆盖不了左边，这样左边就是左mid，右边就是右mid（精髓）
//                left = right;
//                //如果num1Start>=m说明num2Start肯定<n
//                //如果num2Start>=n说明只能增加num1Start了，又或者说num1的数据小就移动num1的指针（精髓）
//                if (num1Start < m && (nums2Start >= n || nums1[num1Start] < nums2[nums2Start])) {
//                    right = nums1[num1Start++];
//                } else {
//                    right = nums2[nums2Start++]; }
//            }
//            //这个判断奇偶
//            if ((len & 1) == 0)
//                return (left + right) / 2.0;
//            else
//                return right;
//        }
//    }
//}
//leetcode submit region end(Prohibit modification and deletion)
