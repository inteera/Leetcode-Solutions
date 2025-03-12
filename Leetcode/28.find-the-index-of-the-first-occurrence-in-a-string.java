/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Find the Index of the First Occurrence in a String
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        
        for(int i = 0; i < haystack.length() - needle.length() + 1; i++){
            if(haystack.substring(i, i+needle.length()).compareTo(needle) == 0){
                return i;
            }
        }

        return -1;
        //return haystack.indexOf(needle);
    }
}
// @lc code=end

