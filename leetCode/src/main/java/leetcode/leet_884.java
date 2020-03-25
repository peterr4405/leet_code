package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class leet_884 {

    public static String[] uncommonFromSentences(String A, String B) {

        String[] a = A.split(" ");
        String[] b = B.split(" ");
        int len_1 = a.length;
        int len_2 = b.length;
        List<String> list = new ArrayList<>();

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < len_1; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        for (int i = 0; i < len_2; i++) {
            map.put(b[i], map.getOrDefault(b[i], 0) + 1);
        }

        Iterator iter = map.keySet().iterator();
        while (iter.hasNext()) {
            String key = iter.next().toString();

            if (map.get(key) == 1) {
                list.add(key);
            }

        }

        return list.toArray(new String[list.size()]);
    }

    public static void main(String[] args) {

        String A = "this apple is sweet";
        String B = "this apple is sour";
        String[] ans = uncommonFromSentences(A, B);
        for (String s : ans) {
            System.out.println(s);
        }
    }

}
