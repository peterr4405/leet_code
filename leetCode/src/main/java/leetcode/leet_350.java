package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leet_350 {

    public static int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
       
        List<Integer> list = new ArrayList<>();
        
        
        
        for (int i = 0; i < nums1.length; i++) {
            map1.put(nums1[i], map1.getOrDefault(nums1[i], 0) + 1);
        }

        for (int i = 0; i < nums2.length; i++) {
            if(map1.getOrDefault(nums2[i], 0) != 0){
                list.add(nums2[i]);
                map1.put(nums2[i],map1.getOrDefault(nums2[i], 0)-1);
            }
        }
        
        int [] ans = new int[list.size()];
        for(int i=0;i<ans.length;i++){
            ans[i] = list.get(i);
        }
        
        
        return ans;
    }

    public static void main(String[] args) {

        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        int[] ans = intersect(nums1, nums2);
        for (int i : ans) {
            System.out.println(i);
        }
    }

}
