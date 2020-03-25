package leetcode;

public class leet_985 {

    public static int[] sumEvenAfterQueries(int[] A, int[][] queries) {

        int[] ans = new int[A.length];
        int sum = 0;
        for (int a : A) {
            if (a % 2 == 0) {
                sum += a;
            }
        }

        for (int i = 0; i < queries.length; i++) {

            int index = queries[i][1];
            int val = queries[i][0];
            int new_val = A[index] + val;
            if( A[index] %2 ==0){
                sum -=A[index];
            }
            A[index] = new_val;
            if(new_val %2 ==0){
                sum += new_val;
            }
            ans[i] = sum;
           
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4};
        int[][] queries = {
            {1, 0},
            {-3, 1},
            {-4, 0},
            {2, 3}};

        int[] ans = sumEvenAfterQueries(A, queries);
        for (int i : ans) {
            System.out.println(i);
        }
    }

}
