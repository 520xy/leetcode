package editor.cn;//给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
//
// 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。 
//
// 返回容器可以储存的最大水量。 
//
// 说明：你不能倾斜容器。 
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入：[1,8,6,2,5,4,8,3,7]
//输出：49 
//解释：图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。 
//
// 示例 2： 
//
// 
//输入：height = [1,1]
//输出：1
// 
//
// 
//
// 提示： 
//
// 
// n == height.length 
// 2 <= n <= 10⁵ 
// 0 <= height[i] <= 10⁴ 
// 
//
// Related Topics 贪心 数组 双指针 👍 4069 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    //贪心，双指针，我们只要更高（因为指针往中间靠，长度会越来越短）
//    public int maxArea(int[] height) {
//        if(height==null||height.length<2)return 0;
//        int result=0;
//        //定义首尾指针开始计算最大值
//        for(int head=0,tail=height.length-1;head<tail;)
//            //前面长就移动后面的指针，希望后面也会变高
//            if(height[head]>=height[tail]) {
//                result=Math.max(result,(tail-head)*height[tail]);
//                tail--;
//            }
//            //后面长就移动前面的指针，希望前面也会变高
//            else {
//                result=Math.max(result,(tail-head)*height[head]);
//                head++;
//            }
//        return result;
//    }
//}
//leetcode submit region end(Prohibit modification and deletion)
