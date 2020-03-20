package leetcode;


public class leet_1299 {
    
        public static int[] replaceElements(int[] arr) {
        
       int max = -1,tmp;
       
       if(arr == null || arr.length == 0){
           return arr;
       }
       
       for(int i = arr.length-1;i>=0;i--){
           tmp = arr[i];
           arr[i] = max;
           max  = Math.max(max, tmp);
       }
        return arr;
    }
    
    public static void main(String[] args) {
        
        int[] arr = {17,18,5,4,6,1};
        
        int[] ans = replaceElements(arr);
        
        for(int i : ans){
            System.out.println(i);
        }
    }
    
}
