package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leet_1078 {

    public static String[] findOcurrences(String text, String first, String second) {
        List<String> list = new ArrayList<>();
        String[] str = text.split(" ");

        for (int i = 0; i < str.length - 2; i++) {
            if (str[i].equals(first) && str[i + 1].equals(second)) {
                list.add(str[i + 2]);
            }
        }

        String[] ans = new String[list.size()];
        for (int j = 0; j < list.size(); j++) {
            ans[j] = list.get(j);
        }

        return ans;
    }

    public static void main(String[] args) {

        String text = "alice is a good girl she is a good student", first = "a", second = "good";
        String [] s = findOcurrences(text,first,second);
        for(String s1 : s){
            System.out.println(s1);
        }
    }

}
