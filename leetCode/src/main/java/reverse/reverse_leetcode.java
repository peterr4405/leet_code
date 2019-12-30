package reverse;

public class reverse_leetcode {

    public static void main(String[] args) {
        /*
        int x = 314;
        reverse(x);
        System.out.println(x);
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < i *2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i > 0; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < i * 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    //假設x=314，第一次迴圈  p = 4 ans = 4 x=31 ->第二次 p = 1 ans = 41 x = 3 ->第三次 p = 3 ans = 413 x = 0
    public static int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            int p = x % 10;
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && p > 7)) {
                return 0;
            }
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && p < (-8))) {
                return 0;
            }
            ans = ans * 10 + p;
            x /= 10;
        }
        return ans;
    }

}
