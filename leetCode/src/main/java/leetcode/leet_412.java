package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leet_412 {

    public static List<String> fizzBuzz(int n) {

        List<String> ans = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                ans.add("FizzBuzz");
            } else if (i % 5 == 0) {
                ans.add("Buzz");
            } else if (i % 3 == 0) {
                ans.add("Fizz");
            } else {
                ans.add(Integer.toString(i));
            }

        }
        return ans;

    }

    public static void main(String[] args) {

        int n = 15;
        List<String> ans = fizzBuzz(n);
        for (String s : ans) {
            System.out.println(s);
        }
    }

}
