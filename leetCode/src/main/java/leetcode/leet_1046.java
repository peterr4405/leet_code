package leetcode;

import java.util.Collections;
import java.util.PriorityQueue;

public class leet_1046 {

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int s : stones) {
            q.add(s);
        }

        while (q.size() >= 2) {
            int max = q.poll();
            int p = q.poll();
            q.add(max - p);
        }
        return q.peek();
    }

    public static void main(String[] args) {

        int[] stones = {2, 7, 4, 1, 8, 1};
        int res = lastStoneWeight(stones);
        System.out.println(res);
    }

}
