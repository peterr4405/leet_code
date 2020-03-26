package leetcode;

import java.util.Arrays;
import java.util.Collections;

public class leet_1189 {

    public static int maxNumberOfBalloons(String text) {

        int b = 0, a = 0, l = 0, o = 0, n = 0;
        for (char c : text.toCharArray()) {
            switch (c) {
                case 'b':
                    ++b;
                    break;
                case 'a':
                    ++a;
                    break;
                case 'l':
                    ++l;
                    break;
                case 'o':
                    ++o;
                    break;
                case 'n':
                    ++n;
                    break;
            }
        }

        return Collections.min(Arrays.asList(b, a, l / 2, o / 2, n));
    }

    public static void main(String[] args) {

        String text = "loonbalxballpoon";
        int ans = maxNumberOfBalloons(text);
        System.out.println(ans);

    }

}
