package leetcode;

import com.sun.org.apache.xpath.internal.compiler.Keywords;
import java.util.HashSet;
import java.util.Set;

public class Morse {

    public static void main(String[] args) {
        String str = "HELLO";
       
        
    }

    public int uniqueMorseRepresentations(String[] words) {
        final String[] MORSE = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        
        Set<String> set = new HashSet<>();

        for(String str : words){
            StringBuilder sb = new StringBuilder();
            for(char c : str.toCharArray()){
                sb.append(MORSE[c-'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }

}
