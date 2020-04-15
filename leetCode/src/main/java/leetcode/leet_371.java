package leetcode;


public class leet_371 {
    
     public static int getSum(int a, int b) {
        int same = (a & b) << 1;
        int dif = a ^ b;
        return same == 0 ? dif : getSum(same, dif);
    }
    
 
    
     
    public static void main(String[] args) {
        
        int a=17,b=7;
        int sum = getSum(a, b);  

        System.out.println(sum);
    }
    
}
