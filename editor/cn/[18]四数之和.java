package editor.cn;//给你一个由 n 个整数组成的数组 nums ，和一个目标值 target 。请你找出并返回满足下述全部条件且不重复的四元组 [nums[a], nums[
//b], nums[c], nums[d]] （若两个四元组元素一一对应，则认为两个四元组重复）： 
//
// 
// 0 <= a, b, c, d < n 
// a、b、c 和 d 互不相同 
// nums[a] + nums[b] + nums[c] + nums[d] == target 
// 
//
// 你可以按 任意顺序 返回答案 。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,0,-1,0,-2,2], target = 0
//输出：[[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
// 
//
// 示例 2： 
//
// 
//输入：nums = [2,2,2,2,2], target = 8
//输出：[[2,2,2,2]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 200 
// -10⁹ <= nums[i] <= 10⁹ 
// -10⁹ <= target <= 10⁹ 
// 
//
// Related Topics 数组 双指针 排序 👍 1502 👎 0


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    //类似三数之和，利用四个指针head，left=head+1，right=tail-1，tail
//    public List<List<Integer>> fourSum(int[] nums, int target) {
//        //定义大集合
//        List<List<Integer>>list = new ArrayList<>();
//        //判断数组是否有进行判断的必要
//        if(nums == null || nums.length <4){ return list; }
//        //对数组进行排序
//        Arrays.sort(nums);
//        //开始循环，需要遍历到最后四个数，给head赋值规定起始索引
//        for(int head=0;head<nums.length-3;head++) {
//            //这里是判断小数是否太大，超过直接退出循环即可
//            if ((long)nums[head] + nums[head + 1] + nums[head + 2] + nums[head + 3] > target) {
//                break;
//            }
//            //给tail赋值，每给一个新的head，tail都以nums.length-1作为初始索引，相当于把head固定了
//            for (int tail = nums.length - 1; tail >= head + 3; tail--)
//            {
//                //判断大数是否太小，超过直接退出循环即可
//                if ((long)nums[tail] + nums[tail-1] + nums[tail-2] + nums[tail-3] < target) {
//                    break;
//                }
//                //每次tail更新时left=head+1，right=tail-1;相当于把head和tail固定了
//                //每次只移动right和left指针
//                int left = head + 1;
//                int right = tail - 1;
//                //循环结束条件left>=right
//                while (left < right) {
//                    //这里的0L是点睛之笔，如果没有好像不承认是long类型，依旧会溢出
//                    long sum = 0L+nums[head] + nums[tail] + nums[left] + nums[right];
//                    //sum和target相等就收集数据
//                    if (sum == target) {
//                        //定义小集合
//                        List<Integer> integers = new ArrayList<>();
//                        //加入数据
//                        integers.add(nums[head]);
//                        integers.add(nums[left]);
//                        integers.add(nums[right]);
//                        integers.add(nums[tail]);
//                        //小集合入大集合
//                        list.add(integers);
//                        //nums[left]进行判重处理，没有第一句可能造成left+1越界，已经用的值就跳过
//                        while (left < right && nums[left] == nums[left + 1])
//                            left++;
//                        left++;
//                        //nums[right]进行判重处理，没有第一句可能造成right-1越界，已经用的值就跳过
//                        while (left < right && nums[right] == nums[right - 1])
//                            right--;
//                        right--;
//                        //sum>target说明数据过大需要小一点则right--
//                    } else if (sum > target)
//                        right--;
//                    else {
//                        //sum<target说明数据过小需要大一点则left++
//                        left++;
//                    }
//                }
//                //开始移动tail，tail进行判重，tail>head + 2防止tail-1越界，
//                while (tail>head + 2&&nums[tail] == nums[tail - 1])
//                    //这里只有一个tail--;因为for循环会自减一次
//                    tail--;
//            }
//            //开始移动head，head判重，head<nums.length-3,是防止越界，head+1越界
//            while (head<nums.length-3&&nums[head] == nums[head+1])
//                //同样这里只有一个head++;因为for循环会自加一次
//                head++;
//        }
//        //全部收集完返回大集合即可
//        return list;
//    }
//}
//leetcode submit region end(Prohibit modification and deletion)
