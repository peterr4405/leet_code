package leetcode;

public class leet_1047 {

    public static String removeDuplicates(String S) {
        /*
        char [] array = S.toCharArray();
        int tmp = 0;
            for(int i =0;i<array.length;i++){
                if(tmp ==0 || array[i] != array[tmp-1]){
                    array[tmp++] = array[i];
                }else{
                    tmp--;
                }
            }
         return new String(array, 0, tmp);
        */
            int i = 0, n = S.length();
        char[] res = S.toCharArray();
        for (int j = 0; j < n; ++j, ++i) {
            res[i] = res[j];
            if (i > 0 && res[i - 1] == res[i]) // count = 2
                i -= 2;
        }
        return new String(res, 0, i);
         
    }

    public static void main(String[] args) {

            String s = "abbaca";
            System.out.println(removeDuplicates(s));
            
    }

}
