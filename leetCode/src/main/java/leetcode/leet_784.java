package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leet_784 {

    public static List<String> letterCasePermutation(String S) {

        List<String> ret = new ArrayList<>();
        StringBuilder sb = new StringBuilder(S);
        backtrack(sb, 0, ret);
        return ret;

    }

    private static void backtrack(StringBuilder sb, int startIndex, List<String> list) {
        list.add(sb.toString());
        for (int i = startIndex; i < sb.length(); i++) {
            if (!Character.isLetter(sb.charAt(i))) {
                continue;
            }
            char ch = sb.charAt(i);
            boolean isUpper = Character.isUpperCase(ch);
            sb.deleteCharAt(i);
            sb.insert(i, isUpper
                    ? Character.toLowerCase(ch)
                    : Character.toUpperCase(ch));
            backtrack(sb, i + 1, list);
            sb.deleteCharAt(i);
            sb.insert(i, isUpper
                    ? Character.toUpperCase(ch)
                    : Character.toLowerCase(ch));
        }
    }

    public static void main(String[] args) {

        String s = "A1b2";

        List<String> ans = letterCasePermutation(s);
        for (String s2 : ans) {
            System.out.println(s2);
        }
    }

}
