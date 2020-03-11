package leetcode;

import java.util.Arrays;


public class leet_908 {
    
        public int smallestRangeI(int[] A, int K) {
    
            Arrays.sort(A);
            Math.abs(K);
            int res = A[A.length-1]-A[0];
            return (res-2*K) >= 0 ? (res-2*K) : 0 ;
                    
    }
    
    
    public static void main(String[] args) {
        
    }
    
}

