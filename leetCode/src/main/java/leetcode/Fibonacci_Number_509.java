package leetcode;


public class Fibonacci_Number_509 {
    
    public static void main(String[] args) {
       
    }
    
    class Solution {
    public int fib(int N) {
        int cur=0,next=1;
        while(N-->0){
            next = next+cur;
            cur = next-cur;
        }
        return cur;
    }
}
    
}
