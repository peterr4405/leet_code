package leetcode;

import java.util.Arrays;

public class leet_383 {

    public static boolean canConstruct(String ransomNote, String magazine) {

        if(ransomNote.length() ==0){
            return true;
        }
        
        if(magazine.length() <= ransomNote.length()){
            return false;
        }
        char[] mag = magazine.toCharArray();
        Arrays.sort(mag);

        for (char c : ransomNote.toCharArray()) {

            for(int i=0;i<mag.length;i++){
                if(c == mag[i]){
                    mag[i] = ' ';
                    break;
                }
                if(i == mag.length-1){
                    return false;
                }
            }
            
        }
        return true;
    }

    public static void main(String[] args) {

        String a = "aa", b = "ab";
        boolean res = canConstruct(a, b);
        System.out.println(res);
    }

}
