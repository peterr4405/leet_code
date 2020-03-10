package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leet_1200 {

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {

        if (arr == null || arr.length == 0) {
            return null;
        }
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();

        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            int val = Math.abs(arr[i] - arr[i - 1]);
            if (val < min) {
                ans.clear();
                min = val;
                add(ans, arr[i - 1], arr[i]);
            } else if (val == min) {
                add(ans, arr[i - 1], arr[i]);
            }
        }
        return ans;
    }

    public static List<List<Integer>> add(List<List<Integer>> list, int num, int num2) {
        List<Integer> input = new ArrayList<>();
        input.add(num);
        input.add(num2);
        list.add(input);
        return list;
    }

    public static void main(String[] args) {

        int[] arr = {4, 2, 1, 3};
        List<List<Integer>> res = minimumAbsDifference(arr);
        res.stream().forEach(v -> System.out.println(v));
    }

}
