package leetcode;

public class leet_1275 {

    public static String tictactoe(int[][] moves) {
        int n = 3;
        if (moves.length < n * 2 - 1) {
            return "Pending";
        }

        // Initializing the 1-D arrays
        int[] rowSum = new int[n];
        int[] colSum = new int[n];
        // Initializing the diagonal variables
        int diagSum = 0;
        int revDiagSum = 0;

        for (int i = 0; i < moves.length; i++) {
            // Check if index represents A or B, where A is even and B is odd
            int index = i % 2;
            // If it is A, we add 1 to corresponding row/column/diagonal, if it's B, we add -1
            int curr = index == 0 ? 1 : -1;
            // Find out current row and column values
            int row = moves[i][0];
            int col = moves[i][1];
            // Add the current move value (1 or -1) to existing arrays & diagonal variables
            rowSum[row] += curr;
            colSum[col] += curr;
            // Diagonal variables are to be updated only if current index represents diagonal element.
            if (row == col) {
                diagSum += curr;
            }
            if (row + col == n - 1) {
                revDiagSum += curr;
            }
            // Check if any of the row/column/diagonal is completely filled with A or B.
            if (Math.abs(rowSum[row]) == n || Math.abs(colSum[col]) == n || Math.abs(diagSum) == n || Math.abs(revDiagSum) == n) {
                return index == 0 ? "A" : "B";
            }
        }
        return (moves.length == n * n) ? "Draw" : "Pending";
    }

    public static void main(String[] args) {

        int[][] moves = {
            {0, 0},
            {2, 0},
            {1, 1},
            {2, 1},
            {2, 2}
        };
        String res = tictactoe(moves);
        System.out.println(res);
    }

}
