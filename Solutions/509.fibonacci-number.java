/*
 * @lc app=leetcode id=509 lang=java
 *
 * [509] Fibonacci Number
 */

// @lc code=start
class Solution {
    public int fib(int n) {
        if(n == 0 || n == 1) return n;
        int a = 0, b = 1, temp;
        for(int i = 2; i <= n; i++){
            temp = b;
            b += a;
            a = temp;
        }
        return b;
    }
}
// @lc code=end

