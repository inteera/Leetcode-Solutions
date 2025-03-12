/*
 * @lc app=leetcode id=219 lang=java
 *
 * [219] Contains Duplicate II
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> numbers = new HashMap<>();
        int val = 0;

        for(int i = 0; i < nums.length; i++){
            val = nums[i];
            if(numbers.containsKey(val) && i - numbers.get(val) <= k){
                return true;
            }
            numbers.put(val, i);
        }
        return false;
    }
}
// @lc code=end

