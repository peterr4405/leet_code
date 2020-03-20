package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leet_500 {

    public static String[] findWords(String[] words) {

        String[] check = {"qwertyuiopQWERTYUIOP", "asdfghjklASDFGHJKL", "zxcvbnmZXCVBNM"};
        List<String> list = new ArrayList<>();
        int seat = 0;

        for (int i = 0; i < words.length; i++) {

            for (int k = 0; k < check.length; k++) {
                if (check[k].contains("" + words[i].charAt(0))) {
                    seat = k;
                    break;
                }
            }

            for (int j = 0; j < words[i].length(); j++) {
                char c = words[i].charAt(j);
                if (check[seat].contains("" + c)) {
                    if (j == words[i].length() - 1) {
                        list.add(words[i]);
                    }
                } else {
                    break;
                }

            }

        }
        
        String [] ans = new String[list.size()];
        for(int x=0;x<list.size();x++){
            ans[x] = list.get(x);
        }
        return ans;
    }

    public static void main(String[] args) {

        String[] S = {"Hello", "Alaska", "Dad", "Peace"};
        String[] ans = findWords(S);
        for (String s2 : ans) {
            System.out.println(s2);
        }
    }

}
