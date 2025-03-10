/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        int i = 0;
        int j = s.length() - 1;

        while(i < j){
            char first = s.charAt(i);
            char last = s.charAt(j);
            if(!Character.isLetterOrDigit(first)){
                i++;
            }
            else if(!Character.isLetterOrDigit(last)){
                j--;
            }
            else{
                if(Character.toLowerCase(first) != Character.toLowerCase(last)){
        		    return false;
        	    }
                i++;
                j--;
            }
        }

        return true;
    }
}
// @lc code=end

