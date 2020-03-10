package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leet_1237 {

    /*
 * // This is the custom function interface.
 * // You should not implement it, or speculate about its implementation
 * class CustomFunction {
 *     // Returns f(x, y) for any given positive integers x and y.
 *     // Note that f(x, y) is increasing with respect to both x and y.
 *     // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
 *     public int f(int x, int y);
 * };
     */

    class Solution {

        public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
            List<List<Integer>> res =new ArrayList<>();            
            for(int i=1,j=z;i<=z&&j>0;){
                int temp = customfunction.f(i,j);
                if(temp == z){
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    res.add(list);
                }
                if(temp < z){
                    i++;
                }else{
                    j--;
                }
            }
            return res;
        }
    }

}
