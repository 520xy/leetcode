package editor.cn;//给你一个长度为 n 的整数数组 nums 和 一个目标值 target。请你从 nums 中选出三个整数，使它们的和与 target 最接近。
//
// 返回这三个数的和。 
//
// 假定每组输入只存在恰好一个解。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [-1,2,1,-4], target = 1
//输出：2
//解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
// 
//
// 示例 2： 
//
// 
//输入：nums = [0,0,0], target = 1
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// 3 <= nums.length <= 1000 
// -1000 <= nums[i] <= 1000 
// -10⁴ <= target <= 10⁴ 
// 
//
// Related Topics 数组 双指针 排序 👍 1332 👎 0


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public int threeSumClosest(int[] nums, int target) {
//        //先对数组进行排序，这样才好进行滑动，和舍弃数据
//        Arrays.sort(nums);
//        //进行初始化
//        int result=nums[0]+nums[1]+nums[2];
//        //快速判断一下看能不能省事（三个最小的都比target大后面只会更大）
//        if(result>target)return result;
//        //固定head指针移动mid和tail来寻找合适的数组
//        for(int head=0;head< nums.length-2;head++) {
//            //每次获取新head时mid和tail需要重新初始化，nums[mid]表示nums[head]右边第一个数，
//            //nums[tail]始终数组表示最后一个数
//            int tail=nums.length-1,mid=head+1;
//            //固定head，移动mid，tail
//            while (mid<tail)
//            {
//                //如果三数之和为target，则说明这组数据很合适
//                int sum=nums[head]+nums[tail]+nums[mid];
//                if(sum==target){
//                    return target;
//                    //如果三数之和<0,说明nums[mid]小了，需要大点，
//                }else if (sum<target) {
//                    //nums[tail]==[tail-1]也不要移动，防止三个值不能相同如1 2 2 2 2 3
//                    mid++;
//                }
//                else {
//                    //如果三数之和>0,说明nums[tail]大了，需要小点,
//                    tail--;
//                }
//                result=(Math.abs(sum-target)>Math.abs(result-target))?result:sum;
//            }
//            //这里要去掉和nums[head]相同的值，因为相同的head增加无意义的遍历次数
//            //for循环的自加会去掉最后一个值
//            while (head<tail&&nums[head]==nums[head+1])
//                head++;
//        }
//        return result;
//    }
//}
//leetcode submit region end(Prohibit modification and deletion)
