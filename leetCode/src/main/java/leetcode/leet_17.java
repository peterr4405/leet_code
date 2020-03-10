package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leet_17 {

    public static List<String> letterCombinations(String digits) {
        String[] letters = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
       List<String> ans = new ArrayList<>();
       String [] s = new String [digits.length()];
       for(int i=0;i<digits.length();i++){
           s[i] = letters[digits.charAt(i)];
       } 

        for(int j=0; j< s[j].length();j++){
            String fir = "";
            for(char c : s[j].toCharArray()){
                ans.add(fir+c);
            }
        }

        return ans;
    }
    


    public static void main(String[] args) {

        String s = "23";

        System.out.println(letterCombinations(s));

    }

}
