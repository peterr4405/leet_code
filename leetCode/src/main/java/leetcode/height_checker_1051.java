package leetcode;

import java.util.Arrays;


public class height_checker_1051 {
    
        public static void main(String[] args) {
        
            int[] a= {1,2,1,4,1,3,2};
            System.out.println(heightChecker(a));
            Arrays.sort(a);
            for(int b : a){
                System.out.print(b+" ");
            }
    }
    
    
        public static int heightChecker(int[] heights) {
        
            int [] ans = Arrays.copyOf(heights, heights.length);
            Arrays.sort(ans);
            int count = 0;
            
            for(int i=0;i<heights.length;i++){
                if(ans[i] != heights[i]){
                    count++;
                }
            }
            return count;
    }
    
}
