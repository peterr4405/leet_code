package leetcode;

public class leet_1103 {

    public static int[] distributeCandies(int candies, int num_people) {

        int[] res = new int[num_people];
        int count = 1, index = 0;

        while (candies > 0) {
            if (candies - count >= 0) {
                res[index++] += count;
                candies -= count;
                count++;
            } else {
                res[index++] += candies;
                break;
            }
            if (index == res.length) {
                index = 0;
            }
        }

        return res;
    }

    public static void main(String[] args) {

        int candies = 10, num_people = 3;
        int[] ans = distributeCandies(candies, num_people);
        for (int i : ans) {
            System.out.println(i);
        }

    }

}
