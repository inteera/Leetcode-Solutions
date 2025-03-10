/*
 * @lc app=leetcode id=118 lang=java
 *
 * [118] Pascal's Triangle
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        temp.add(1);
        list.add(temp);
        if(numRows >= 2){
            temp = new ArrayList<Integer>();
            temp.add(1);
            temp.add(1);
            list.add(temp);
        }
        for(int i = 2; i < numRows; i++){
            temp = new ArrayList<Integer>();
            temp.add(1);
            for(int j = 0; j < i - 1; j++){
                temp.add(list.get(i - 1).get(j) + list.get(i - 1).get(j+1));
            }
            temp.add(1);
            list.add(temp);
        }
        

        return list;
    }
}
// @lc code=end

