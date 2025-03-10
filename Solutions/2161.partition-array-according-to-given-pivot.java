/*
 * @lc app=leetcode id=2161 lang=java
 *
 * [2161] Partition Array According to Given Pivot
 */

// @lc code=start
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int i = 0, j = nums.length - 1, k = i , l = j;
        int[] arr = new int[nums.length];

        while(i < nums.length){
            if(nums[i] < pivot){
                arr[k++] = nums[i];
            }
            if(nums[j] > pivot){
                arr[l--] = nums[j];
            }
            i++;
            j--;
        }

        for(int m = k; m <= l; m++){
            arr[m] = pivot;
        }
        return arr;
    }
}
// @lc code=end

