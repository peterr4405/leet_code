package leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class leet_409 {

    public static int longestPalindrome(String s) {

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int len = 0;
        boolean hasOdd = false;
        
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        /* 方法二
        for(Character o : map.keySet()){
         int i = map.get(o);
            len += i/2;
        }
        */
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            
            Map.Entry mapEntry = (Map.Entry) it.next();
            
            if((int)mapEntry.getValue() %2 !=0){
                hasOdd = true;
            }
            
            len += (int) (mapEntry.getValue()) / 2;
        }
        len *= 2;

        if (hasOdd) {
            return len+1;
        }
        return len;
    }

    public static void main(String[] args) {

        String s = "abbadac";

        int len = longestPalindrome(s);
        System.out.println(len);
    }

}
