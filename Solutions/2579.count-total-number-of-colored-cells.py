/*
 * @lc app=leetcode id=2579 lang=python
 *
 * [2579] Count Total Number of Colored Cells
 */

// @lc code=start
class Solution(object):
    def coloredCells(self, n):
        return 1 + 2 * (n-1) * n
        
// @lc code=end

