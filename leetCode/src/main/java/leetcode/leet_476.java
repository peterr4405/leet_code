package leetcode;

public class leet_476 {

    public static int findComplement(int num) {

        int res = 0;
        int count = 0;
        int base = 1;

        while (num != 0) {
            if (num % 2 == 0) {
                res += base;
            }
            base = base << 1;
            num = num >> 1;
        }

        return res;
    }

    public static void main(String[] args) {

        int num = 16;
        int res = findComplement(num);

        System.out.println(res);
    }

}
