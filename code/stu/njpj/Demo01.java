package stu.njpj;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author hexinxiang
 * <br/>Date: 2022/7/27
 * <br/>Time: 22:10
 */

public class Demo01 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(ints));
    }
}

/**
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 *
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {

        // 设置一个键值对的值 键是 一个值 值也是一个值

        Map<Integer,Integer> nuMap=new HashMap<>();
        nuMap.put(nums[0],0 );
        /*
        *  值为key 下标为 value
        * */

        for (int i = 1; i < nums.length; i++) {
            int key = target - nums[i];
            // 如果包含这个数 将这个数 还有这个数找到的下标返回
            if (nuMap.containsKey(key)){
                return new int[]{nuMap.get(key),i};
            }else {
                //将本次数字存储进去
                nuMap.put(nums[i],i );
            }
            return  null;
        }

        return nums;
    }
}