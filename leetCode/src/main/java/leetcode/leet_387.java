package leetcode;

import java.util.HashMap;
import java.util.Map;

public class leet_387 {

    public static int firstUniqChar(String s) {

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] box = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

          for(int j=0;j<s.length();j++)
         {
            if( map.get(s.charAt(j))==1)
                return j;
         }
        
        return -1;
    }

    public static void main(String[] args) {

        String s = "leetcode";

        int ans = firstUniqChar(s);
        System.out.println(ans);
    }

}
