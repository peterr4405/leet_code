package leetcode;

import java.util.Arrays;
import java.util.TreeSet;



public class square_of_Array {
    
    public static void main(String[] args) {
        
        int[] A= {-2,4,5,0,7,6,9}; 
        int[] ans = sortedSquares(A);
        for(int i : ans){
            System.out.print(i+" ");
        }
    }
    
        public static int[] sortedSquares(int[] A) {
        /*
            int[]ans = new int[A.length];

            for(int i=0;i<A.length;i++){
                A[i] *=A[i];
            }
            for(int i=0;i<A.length;i++){
                for(int j=A.length-1;j>i;j--){
                    if(A[i]>A[j]){
                        int temp = A[i];
                        A[i] = A[j];
                        A[j] = temp;
                    }
                }
            }
            for(int i=0;i<A.length;i++){
                ans[i] = A[i];
            }
            return ans;
            */
            return Arrays.stream(A).map(s -> s*s).sorted().toArray();
    }
}
