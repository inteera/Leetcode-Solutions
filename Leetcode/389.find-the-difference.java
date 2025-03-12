/*
 * @lc app=leetcode id=389 lang=java
 *
 * [389] Find the Difference
 */

// @lc code=start
class Solution {
    public char findTheDifference(String s, String t) {
        int c = 0;

        for(char a : t.toCharArray()){
            c += a;
        }

        for(char a : s.toCharArray()){
            c -= a;
        }

        return (char) c;
    }
}
// @lc code=end

