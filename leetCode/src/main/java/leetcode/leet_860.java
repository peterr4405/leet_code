package leetcode;

import java.util.HashMap;
import java.util.Map;

public class leet_860 {

    public static boolean lemonadeChange(int[] bills) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i : bills) {
            map.put(i, map.getOrDefault(i, 0) + 1);

            if (i == 10) {
                if (map.get(5) == null) {
                    return false;
                }
                int val = map.get(5) - 1;
                if (val < 0) {
                    return false;
                }
                map.put(5, val);
            } else if (i == 20) {
        
                if (map.get(10) == null && map.get(5) < 3) {
                    return false;
                } 
                if (map.get(5) >= 3 && map.get(10) == null || map.get(5) >= 3 && map.get(10) == 0) {
                    int val = map.get(5) - 3;
                    if (val < 0) {
                        return false;
                    }
                    map.put(5, val);
                } else if (map.get(5) > 0 && map.get(10) > 0) {
                    int val = map.get(5) - 1;
                    int val2 = map.get(10) - 1;
                    if (val < 0 || val2 < 0) {
                        return false;
                    }
                    map.put(5, val);
                    map.put(10, val2);
                } else {
                    return false;
                }
            }

        }

        return true;
    }

    public static void main(String[] args) {

        int[] input = {5,5,10,20,5,5,5,5,5,5,5,5,5,10,5,5,20,5,20,5};
        boolean res = lemonadeChange(input);
        System.out.println(res);
    }

}
