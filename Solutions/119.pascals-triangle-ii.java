/*
 * @lc app=leetcode id=119 lang=java
 *
 * [119] Pascal's Triangle II
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        temp.add(1);
        list.add(temp);
        if(rowIndex + 1 >= 2){
            temp = new ArrayList<Integer>();
            temp.add(1);
            temp.add(1);
            list.add(temp);
        }
        for(int i = 2; i < rowIndex + 1; i++){
            temp = new ArrayList<Integer>();
            temp.add(1);
            for(int j = 0; j < i - 1; j++){
                temp.add(list.get(i - 1).get(j) + list.get(i - 1).get(j+1));
            }
            temp.add(1);
            list.add(temp);
        }
        

        return list.get(rowIndex);
    }
}
// @lc code=end

