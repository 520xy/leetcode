package editor.cn;//给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j !=
//k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请 
//
// 你返回所有和为 0 且不重复的三元组。 
//
// 注意：答案中不可以包含重复的三元组。 
//
// 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [-1,0,1,2,-1,-4]
//输出：[[-1,-1,2],[-1,0,1]]
//解释：
//nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0 。
//nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0 。
//nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0 。
//不同的三元组是 [-1,0,1] 和 [-1,-1,2] 。
//注意，输出的顺序和三元组的顺序并不重要。
// 
//
// 示例 2： 
//
// 
//输入：nums = [0,1,1]
//输出：[]
//解释：唯一可能的三元组和不为 0 。
// 
//
// 示例 3： 
//
// 
//输入：nums = [0,0,0]
//输出：[[0,0,0]]
//解释：唯一可能的三元组和为 0 。
// 
//
// 
//
// 提示： 
//
// 
// 3 <= nums.length <= 3000 
// -10⁵ <= nums[i] <= 10⁵ 
// 
//
// Related Topics 数组 双指针 排序 👍 5630 👎 0


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//
//    public List<List<Integer>> threeSum(int[] nums) {
//        //先对数组进行排序，这样才好进行滑动，和舍弃数据
//        Arrays.sort(nums);
//        //定义一个大的集合用于装小集合
//        List<List<Integer>> arrayList = new ArrayList<>();
//        //固定head指针移动mid和tail来寻找合适的数组
//        for(int head=0;head< nums.length-2;head++) {
//            //当nums[head]>0时说明nums[mid]>0,nums[tail]>0
//            if(nums[head]>0)break;
//            //每次获取新head时mid和tail需要重新初始化，nums[mid]表示nums[head]右边第一个数，
//            //nums[tail]始终数组表示最后一个数
//            int tail=nums.length-1,mid=head+1;
//            //固定head，移动mid，tail
//            while (mid<tail)
//            {
//                //如果三数之和为0，则说明这组数据很合适
//                if(nums[head]+nums[tail]+nums[mid]==0){
//                    List<Integer> list = new ArrayList<>();
//                    list.add(nums[head]);
//                    list.add(nums[mid]);
//                    list.add(nums[tail]);
//                    //把小集合加入大集合
//                    arrayList.add(list);
//                    //因为数据合适但是不能有相同的小集合，所以把相同的nums[mid]跳过
//                    while (mid<tail&&nums[mid]==nums[mid+1])
//                        mid++;
//                    mid++;
//                    //把相同的nums[tail]去掉
//                    while (mid<tail&&nums[tail]==nums[tail-1])
//                        tail--;
//                    tail--;
//                    //如果三数之和<0,说明nums[mid]小了，需要大点，head固定所以不能移动
//                }else if (nums[head]+nums[tail]+nums[mid]<0)
//                    mid++;
//                else
//                    //如果三数之和>0,说明nums[tail]大了，需要小点
//                    tail--;
//            }
//            //这里要去掉和nums[head]相同的值，因为相同的head会得到相同的小集合
//            //for循环的自加会去掉最后一个值
//            while (head<tail&&nums[head]==nums[head+1])
//                head++;
//        }
//        return arrayList;
//    }
//}
//leetcode submit region end(Prohibit modification and deletion)
