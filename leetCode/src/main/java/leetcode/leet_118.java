package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leet_118 {

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();
        if (numRows <= 0) {
            return ans;
        }

        for (int i = 1; i <= numRows; i++) {
            List<Integer> row = new ArrayList<Integer>(i);
            row.add(1);

            for (int j = 1; j < i - 1; j++) {
                row.add(ans.get(i - 2).get(j - 1) + ans.get(i - 2).get(j));
            }

            if (i > 1) {
                row.add(1);
            }

            ans.add(row);
        }

        return ans;
    }

    public static void main(String[] args) {

        List<List<Integer>> ans = generate(5);

        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }

}
