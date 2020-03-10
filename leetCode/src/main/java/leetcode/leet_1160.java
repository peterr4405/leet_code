package leetcode;

import java.util.Scanner;

public class leet_1160 {

    public static int countCharacters(String[] words, String chars) {

        int cal = 0;

        for (String word : words) {

            if (check(word, chars) == true) {
                cal += word.length();
            }

        }

        return cal;
    }

    public static boolean check(String word, String chars) {

        char[] c = word.toCharArray();
        char[] c2 = chars.toCharArray();
        int count = 0;
        boolean isSpell = false;

        for (int i = 0; i < word.length(); i++) {

            tmp:
            for (int j = 0; j < chars.length(); j++) {

                if (c[i] == c2[j]) {
                    count++;
                    c2[j] = '0';
                    if (count == word.length()) {
                        isSpell = true;
                        break;
                    }
                    break tmp;
                }

            }
        }

        return isSpell;
    }

    public static void main(String[] args) {

        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";
        System.out.println(countCharacters(words, chars));

    }

}
