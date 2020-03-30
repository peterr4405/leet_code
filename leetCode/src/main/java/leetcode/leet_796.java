package leetcode;

public class leet_796 {

    public static boolean rotateString(String A, String B) {

        if (A.length() != B.length()) {
            return false;
        }

        char[] a = A.toCharArray();
        char[] b = B.toCharArray();

        int begin = 0;
        for (int i = 0; i < a.length; i++) {
            char A_fir = a[i];
            char B_fir = b[begin];
            if (A_fir == B_fir) {
                begin++;
            } else {
                begin = 0;
                B_fir = b[begin];
                if (A_fir == B_fir) {
                    begin++;
                }
            }

        }
        String rotate = B.substring(begin, B.length()) + B.substring(0, begin);
        return A.equals(rotate);
    }

    public static void main(String[] args) {

        String A = "abcde", B = "cdeab";
        boolean res = rotateString(A, B);
        System.out.println(res);

    }

}
