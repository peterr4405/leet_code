package leetcode;

public class leet_704 {

    public static int search(int[] nums, int target) {
        
        for(int i=0;i<nums.length;i++){
            if( target == nums[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {-1,0,3,5,9,12};
        int index = search(nums, 9);
        System.out.println(index);
    }

}
