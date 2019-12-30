package leetcode;

import java.util.ArrayList;
import java.util.List;


public class self_dividing_number {
    
    public static void main(String[] args) {
        
        selfDividingNumbers(1, 22);
        
    }
    
        public static List<Integer> selfDividingNumbers(int left, int right) {
        
            List<Integer> nums = new ArrayList<>();
            
            for(int i=left;i<=right;i++){
                if(isDividing(i)){
                   nums.add(i);
                }
            }
            return nums;
    }
        public static boolean isDividing(int num){
            int temp=0;
            int n=num;
            while(num>0){
                temp = num%10;
                if(temp ==0 || n%temp !=0){
                    return false;
                }
                num /= 10;
            }
            return true;
            
        }
    
}
