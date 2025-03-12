/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];

            if (map.containsKey(value)){
                return new int[]{i, map.get(value)};
            }
            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}
// @lc code=end

