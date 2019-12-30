package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Repeated_Element {

    public static void main(String[] args) {

        int [] A = {1,3,2,4,2};
        
        
            System.out.print(repeatedNTimes2(A));
        
    }

    public static int repeatedNTimes(int[] A) {
        HashSet<Integer> set = new HashSet();
        for (int i : A) {
            if (set.contains(i)) {
                return i;
            } else {
                set.add(i);
            }
        }
        return 0;
    }

    public static int repeatedNTimes2(int[] A) {

        List<Integer> list = new ArrayList<>();
        int ans = 0;
        for (int i : A) {
            if (list.contains(i)) {
                ans = i;
                return ans;
            }
            list.add(i);
        }
        return ans;
    }

}
