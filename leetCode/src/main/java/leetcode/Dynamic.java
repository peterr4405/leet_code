package leetcode;


public class Dynamic {
    
    public static void main(String[] args) {
        
        System.out.println(numDecodings("206"));
        
    }
    
    public static int numDecodings(String s) {
        if (s.length() == 0) return 0;
        int len = s.length();
        int dp[] = new int[len+1];
        dp[0] = 1; // Empty string
        dp[1] = s.charAt(0) != '0' ? 1 : 0;
        char prev = '0', curr = s.charAt(0);
        for (int i = 2; i <= len; ++i) {
            prev = curr;
            curr = s.charAt(i-1);
            if (curr != '0')
                dp[i] += dp[i-1];
            if (prev == '1' || (prev == '2' && curr <= '6'))
                dp[i] += dp[i-2];
        }
        return dp[len];
    }
    
}
