package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class leet_893 {

    public static int numSpecialEquivGroups(String[] A) {

        HashSet set = new HashSet();
        int len = A[0].length();

        for (String s : A) {

            char[] even = new char[len % 2 == 0 ? len / 2 : (len / 2 + 1)];
            char[] odd = new char[len / 2];
            boolean isEven = true;

            int evenIndex = 0, oddIndex = 0;
            for (char c : s.toCharArray()) {
                if (isEven) {
                    even[evenIndex++] = c;
                } else {
                    odd[oddIndex++] = c;
                }
                isEven = !isEven;
            }

            Arrays.sort(even);
            Arrays.sort(odd);
            set.add(new String(even) + new String(odd));

        }
        return set.size();
    }

    public static void main(String[] args) {

        String[] A = {"abcd", "cdab", "cbad", "xyzz", "zzxy", "zzyx"};
        int x = numSpecialEquivGroups(A);
        System.out.println(x);
    }

}
