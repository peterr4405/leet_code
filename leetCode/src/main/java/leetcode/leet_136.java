package leetcode;

import java.util.HashMap;
import java.util.Map;

public class leet_136 {

    public static int singleNumber(int[] nums) {

        int ans = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int j : map.keySet()) {
            if (map.get(j) == 1) {
                ans = j;
                break;
            }
        }
        return ans;

    }

    public static void main(String[] args) {

        int[] nums = {4, 1, 2, 1, 2};
        int res = singleNumber(nums);
        System.out.println(res);
    }

}
