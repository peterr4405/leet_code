package leetcode;

import java.util.Arrays;

public class leet_977 {

    public static int[] sortedSquares(int[] A) {
  
        int[] ans = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            ans[i] = (int) Math.pow(A[i], 2);
        }
        Arrays.sort(ans);
        return ans;
    }

    public static void main(String[] args) {

        int[] a = {-4, -1, 0, 3, 10};

        int[] ans = sortedSquares(a);
        for(int i : ans){
            System.out.println(i);
        }
    }

}
