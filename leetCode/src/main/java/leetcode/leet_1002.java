package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leet_1002 {

    /*
    Given an array A of strings made only from lowercase letters, return a list of all characters that show up in all strings within the list (including duplicates).  For example, if a character occurs 3 times in all strings but not 4 times, you need to include that character three times in the final answer.

You may return the answer in any order.
     */
    public static List<String> commonChars(String[] A) {

        int[] hash = new int[26];
        boolean firstFlag = true;

        for (String word : A) {

            char[] wordchars = word.toCharArray();

            if (firstFlag) {
                for (char wordchar : wordchars) {
                    hash[wordchar - 97]++;
                }
                firstFlag = false;
            } else {
                int[] tmphash = new int[26];
                for (char wordchar : wordchars) {
                    tmphash[wordchar - 97]++;
                }
                for (int i = 0; i < hash.length; i++) {
                    if (hash[i] > tmphash[i]) {
                        hash[i] = tmphash[i];
                    }
                }
            }
        }
        List<String> res = new ArrayList<String>();
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] != 0) {
                String tmp = String.valueOf((char) (i + 97));
                for (int j = 0; j < hash[i]; j++) {
                    res.add(tmp);
                }
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        
        String[] A = {"cool","lock","cook"};
        
        System.out.println(commonChars(A));
        
    }

}
