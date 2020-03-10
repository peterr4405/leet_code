package leetcode;

public class leet_1365 {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int tmp = 0;
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    tmp++;
                }

            }
            ans[i] = tmp;
            tmp = 0;
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {8, 1, 2, 2, 3};
        int[] ans = smallerNumbersThanCurrent(nums);
        for (int i : ans) {
            System.out.print(i + "\t");
        }
    }

}
