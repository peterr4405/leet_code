package leetcode;

public class leet_344 {

    public static void reverseString(char[] s) {
        char tmp = ' ';
        int len = s.length-1;
        for(int i=0;i<s.length/2;i++){
            tmp = s[i];
            s[i] = s[len];
            s[len] = tmp;
            len--;
        }

    }

    public static void main(String[] args) {

        char[] s = {'h','e','l','l','o'};
       reverseString(s);

        
    }

}
