/*
 * @lc app=leetcode id=704 lang=java
 *
 * [704] Binary Search
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int i = 1, location = 0, j = nums.length;

        while(i < j){
            int m = (i + j)/2;
            if(target > nums[m - 1]){
                i = m + 1;
            }
            else{
                j = m;
            }
        }

        if(nums[i - 1] == target){
            location = i - 1;
        }
        else{
            location = -1;
        }
        
        return location;
    }
}
// @lc code=end

