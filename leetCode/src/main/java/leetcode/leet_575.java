package leetcode;

import java.util.HashSet;
import java.util.Set;

public class leet_575 {

    public static int distributeCandies(int[] candies) {

        Set<Integer> set = new HashSet<>();
        int max_len = (candies.length+1)/2;
        for(int i : candies){
            set.add(i);
        }
        return  set.size()> max_len? max_len : set.size();
    }

    public static void main(String[] args) {

        int[] i = {1, 1, 2, 2, 3, 3};
        int ans = distributeCandies(i);
        System.out.println(ans);
    }

}
