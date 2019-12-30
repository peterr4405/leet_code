package leetcode;

import java.util.Arrays;



public class Array_Partition_561 {
    
    public static void main(String[] args) {
        
        int[] A = {1,4,3,2,5,6};
        arrayPairSum(A);
    }
    
        public static int arrayPairSum(int[] nums) {
        
        int i=0,sum=0;
        Arrays.sort(nums);
        while(i<nums.length){
            sum+=nums[i];
            i+=2;
            if(i == nums.length){
                break;
            }
        }
        return sum;
    }
}
