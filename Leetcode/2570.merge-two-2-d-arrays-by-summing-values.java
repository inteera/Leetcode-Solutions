/*
 * @lc app=leetcode id=2570 lang=java
 *
 * [2570] Merge Two 2D Arrays by Summing Values
 */

// @lc code=start
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<Integer> values = new ArrayList<>();
        int length = 0;
        for(int i = 0; i < nums1.length; i++){
            if(!values.contains(nums1[i][0])){
                values.add(nums1[i][0]);
                length++;
            }
        }
        for(int i = 0; i < nums2.length; i++){
            if(!values.contains(nums2[i][0])){
                values.add(nums2[i][0]);
                length++;
            }
        }
        int[][] result = new int[length][2];

        Collections.sort(values);

        for(int i = 0; i < values.size(); i++){
            result[i][0] = values.get(i);
            result[i][1] = 0;
        }

        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < length; j++){
                if(result[j][0] == nums1[i][0]) {
                    result[j][1] += nums1[i][1];
                    break;
                }
            }
        }
        for(int i = 0; i < nums2.length ; i++){
            for(int j = 0; j < length; j++){
                if(result[j][0] == nums2[i][0]) {
                    result[j][1] += nums2[i][1];
                    break;
                }
            }
        }

        return result;
    }
}
// @lc code=end

