package leetcode;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class leet_1337 {

    public static int[] kWeakestRows(int[][] mat, int k) {

        int[] ans = new int[k];
        Set set = new LinkedHashSet();
        int count = 0;

        loop: for (int i = 0; i < mat[0].length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[j][i] != 1) {
                    set.add(j);
                    if (set.size() == k) {
                        break loop;
                    }
                }
            }

        }

        Iterator it = set.iterator();
        while (it.hasNext()) {
            ans[count] = Integer.parseInt(String.valueOf(it.next()));
            count++;
        }
        if (set.size() < k) {
            for (int i = 0; i < k; i++) {
                if (!set.contains(i)) {
                    ans[count] = i;
                    count++;
                    if (count == k) {
                        return ans;
                    }
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {

        int[][] mat = {
            {1, 0, 0, 0},
            {1, 1, 1, 1},
            {1, 0, 0, 0},
            {1, 0, 0, 0}

        };

        int[] ans = kWeakestRows(mat, 2);
        for (int i : ans) {
            System.out.println(i);
        }
    }

}
