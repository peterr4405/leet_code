package leetcode;


public class sort_Array_by_Parity_922 {
    
    public static void main(String[] args) {
        
    }
    
    
        public int[] sortArrayByParityII(int[] A) {
        int[]ans = new int[A.length];
        int odd = 1, even =0;
        for(int i=0;i<A.length;i++){
            if(A[i]%2 == 0){
                ans[even] = A[i];
                even+=2;
            }else{
                ans[odd] = A[i];
                odd+=2;
            }       
        }
            return ans;
    }
}

