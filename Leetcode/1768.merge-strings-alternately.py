/*
 * @lc app=leetcode id=1768 lang=python
 *
 * [1768] Merge Strings Alternately
 */

// @lc code=start
class Solution(object):
    def mergeAlternately(self, word1, word2):
        shortest = 0
        l = 0
        
        mergedString = ""
        
        if len(word1) <= len(word2):
            shortest = len(word1)
            longString = word2
        else:
            shortest = len(word2)
            longString = word1
        
        for i in range(0, shortest):
            mergedString += word1[l]
            mergedString += word2[l]
            l += 1
        
        for i in range(l, len(longString)):
            mergedString += longString[i]
        
        return mergedString
        
// @lc code=end

