/*
 * @lc app=leetcode id=2460 lang=java
 *
 * [2460] Apply Operations to an Array
 */

// @lc code=start
class Solution {
    public int[] applyOperations(int[] nums) {

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i+1]){
                nums[i] *= 2;
                nums[i+1] = 0;
            }else {
                continue;
            }
        }
        for(int i = nums.length - 1; i > 0; i--){
            if(nums[i-1] == 0){
                for(int j = i; j < nums.length; j++){
                    nums[j-1] = nums[j];
                    nums[j] = 0;
                }
            }
        }

        return nums;
    }
}
// @lc code=end

