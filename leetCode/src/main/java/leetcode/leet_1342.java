package leetcode;

public class leet_1342 {

    public static int numberOfSteps(int num) {
        int count = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
                count++;
            } else {
                num -= 1;
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        /*
        Given a non-negative integer num, return the number of steps to reduce it to zero. 
        If the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
         */
        int num = 14;
        System.out.println(numberOfSteps(num));

    }

}
