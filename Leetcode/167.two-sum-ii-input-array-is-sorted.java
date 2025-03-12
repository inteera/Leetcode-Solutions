/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input Array Is Sorted
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int i = 0, j = 1;

        while(true){
            if(numbers[i] + numbers[j] < target){
                i++;
                j++;
            }
            else if(numbers[i] + numbers[j] > target){
                i--;
            }
            else {
                return new int[]{i + 1, j + 1};
            }
        }
    }
}
// @lc code=end