/*
 * @lc app=leetcode id=739 lang=java
 *
 * [739] Daily Temperatures
 */

// @lc code=start
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        if(temperatures.length == 1){
            return new int[]{0};
        }

        int[] answer = new int[temperatures.length];

        Stack<Integer> stack = new Stack<>();
        int i = 1, j = 1, temp = 1;
        for(int element : temperatures){
            if(!stack.empty()){
                if(element <= stack.peek()){
                    i++;
                    stack.push(element);
                    continue;
                }
                while(!stack.empty() && element > stack.peek()){
                    i--;
                    answer[i] = temp;
                    j++;
                    temp++;
                    stack.pop();
                }
                if(!stack.empty()){
                    temp = j;
                }
                else{
                    temp = 1;
                }
                stack.push(element);
                j = 1;
                i += 2;
            }
            else{
                stack.push(element);
            }
            
        }

        return answer;
    }
}
// @lc code=end

