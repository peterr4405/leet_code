package leetcode;

public class leet_867 {

    public static int[][] transpose(int[][] A) {

        int[][] res = new int[A[0].length][A.length];

        for (int i = 0; i < A[0].length; i++) {
            for (int j = 0; j < A.length; j++) {
                res[i][j] = A[j][i];
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int[][] A = {
            {1, 2, 3},
            {4, 5, 6},};

        int[][] ans = transpose(A);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + "\t");
            }
            System.out.println("");
        }
    }

}
