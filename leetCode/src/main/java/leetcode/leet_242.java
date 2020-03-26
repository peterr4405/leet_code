package leetcode;

import java.util.Arrays;



public class leet_242 {

    public static boolean isAnagram(String s, String t) {

        if(t.length() != s.length()){
            return false;
        }
        
        char[] s_char = s.toCharArray();
        char[] t_char = t.toCharArray();
        
        Arrays.sort(s_char);
        Arrays.sort(t_char);
        
        
        
        for( int i=0;i<t_char.length;i++){
            if(s_char[i] == t_char[i]){
                continue;
            }
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        String s = "ab", t = "a";
        boolean cal = isAnagram(s, t);
        System.out.println(cal);
    }

}
