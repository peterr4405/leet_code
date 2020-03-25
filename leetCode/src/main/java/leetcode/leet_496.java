package leetcode;

public class leet_496 {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        int count = 0;
        int tmp =0;
        
        for (int i : nums1) {
            loop: for (int j = 0; j < nums2.length; j++) {
                if(i == nums2[j]){
                   tmp = j;
                   break;
                }
            }
            loop2: for(;tmp<nums2.length;tmp++){
                if(nums2[tmp]>i){
                    ans[count++] = nums2[tmp];
                    break loop2;
                }else if(tmp == nums2.length-1){
                    ans[count++] = -1;
                    break loop2;
                }
            }
            
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] nums1 = {2,4};
        int[] nums2 = {1,2,3,4};

        int[] ans = nextGreaterElement(nums1, nums2);
        for (int i : ans) {
            System.out.println(i);
        }
    }

}
