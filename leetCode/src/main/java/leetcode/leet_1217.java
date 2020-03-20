package leetcode;

public class leet_1217 {

    public static int minCostToMoveChips(int[] chips) {
        int odd = 0;
        int even = 0;
        for (int chip : chips) {
            if ((chip %2) == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return Math.min(even, odd);
    }

    public static void main(String[] args) {

        int[] chips = {1,2,3};
        
        int val = minCostToMoveChips(chips);
        System.out.println(val);
        
    }

}
