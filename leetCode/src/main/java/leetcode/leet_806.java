package leetcode;

import java.util.HashMap;
import java.util.Map;

public class leet_806 {

    public static int[] numberOfLines(int[] widths, String S) {
        int[] ans = new int[2];
        int sum = 0, count = 1;

        for (int i = 0; i < S.length(); i++) {
            int num = widths[S.charAt(i) - 'a'];
            if (sum + num > 100) {
                count += 1;
                sum = 0;
            }
            sum += num;
        }

        ans[0] = count;
        ans[1] = sum;
        return ans;
    }

    public static void main(String[] args) {

        int[] widths = {4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        String S = "bbbcccdddaaa";

        int[] ans = numberOfLines(widths, S);
        for (int i : ans) {
            System.out.println(i);
        }
    }

}
