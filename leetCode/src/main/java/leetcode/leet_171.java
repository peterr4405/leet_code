package leetcode;



public class leet_171 {

    public static int titleToNumber(String s) {
         int sum = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int val  = s.charAt(i) - 64; 
            sum *= 26;
            sum += val;
        }
        
        return sum;    
    }

    public static void main(String[] args) {

       int res= titleToNumber("BA");
        System.out.println(res);
    }

}
