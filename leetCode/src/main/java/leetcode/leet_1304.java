package leetcode;

import java.util.Random;

public class leet_1304 {

    public static int[] sumZero(int n) {

        int[] ans = new int[n];

        for (int i = 0; i < n - 1; i = i + 2) {

            ans[i] = -(i + 1);
            ans[i + 1] = i + 1;
        }
        return ans;
    }

    public static void main(String[] args) {

        int n = 5;

        int[] a = sumZero(n);
        for (int b : a) {
            System.out.println(b);
        }

    }

}
