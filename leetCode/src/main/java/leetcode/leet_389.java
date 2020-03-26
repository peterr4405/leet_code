package leetcode;

import java.util.Arrays;

public class leet_389 {

    public static char findTheDifference(String s, String t) {

        if(t.length() == 1){
            return t.charAt(0);
        }
        char[]s_char = s.toCharArray();
        char[]t_char = t.toCharArray();
        
        Arrays.sort(s_char);
        Arrays.sort(t_char);
        
        for(int i=0;i<s.length();i++){
            if(s_char[i] != t_char[i]){
                return t_char[i];
            }else if (i == s.length()-1)
            {
                return t_char[i+1];
            }
        }
        return t_char[t_char.length];
    }

    public static void main(String[] args) {

        String s = "abcd", t = "abcde";
        char c = findTheDifference(s, t);
        System.out.println(c);

    }

}
