package leetcode;

public class leet_1025 {

    public static boolean divisorGame(int N) {
        
       return N%2 == 0;
        
    }

    public static void main(String[] args) {
        
        boolean res= divisorGame(2);
        System.out.println(res);
    }

}
