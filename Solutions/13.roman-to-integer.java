/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        int result = 0;
        char temp;

        for(int i = s.length() - 1; i >= 0; i--){
            temp = s.charAt(i);
            if(temp == 'I'){
                result += 1;
            }
            else if(temp == 'V'){
                if(i > 0 && s.charAt(i - 1) == 'I'){
                    result += 4;
                    i--;
                    continue;
                }
                result += 5;
            }
            else if(temp == 'X'){
                if(i > 0 && s.charAt(i - 1) == 'I'){
                    result += 9;
                    i--;
                    continue;
                }
                result += 10;
            }
            else if(temp == 'L'){
                if(i > 0 && s.charAt(i - 1) == 'X'){
                    result += 40;
                    i--;
                    continue;
                }
                result += 50;
            }
            else if(temp == 'C'){
                if(i != 0 && s.charAt(i - 1) == 'X'){
                    result += 90;
                    i--;
                    continue;
                }
                result += 100;
            }
            else if(temp == 'D'){
                if(i > 0 && s.charAt(i - 1) == 'C'){
                    result += 400;
                    i--;
                    continue;
                }
                result += 500;
            }
            else if(temp == 'M'){
                if(i > 0 && s.charAt(i - 1) == 'C'){
                    result += 900;
                    i--;
                    continue;
                }
                result += 1000;
            }
        }
        return result;
    }
}
// @lc code=end

