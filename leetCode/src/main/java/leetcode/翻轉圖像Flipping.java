package leetcode;


public class 翻轉圖像Flipping {
    
    public static void main(String[] args) {
        
        int b[][] = {
        {1,1,0},
        {1,0,1},
        {0,0,0}
    };
        flipAndInvertImage(b);
       for(int i=0;i<b.length;i++){
           for(int j=0;j<b[i].length;j++){
               System.out.print(b[i][j]);
           }
           System.out.println("");
       }
    }
    
    
        public static int[][] flipAndInvertImage(int[][] A) {
        for(int i=0;i<A.length;i++){
         int start = 0 ,end = A[i].length-1;
            while(start<end){
                if(A[i][start] != A[i][end]){
                    start++;
                    end--;
                }else{
                    A[i][start] = A[i][start] == 1 ? 0:1;
                    A[i][end] = A[i][end] == 1 ? 0:1;
                    start++;
                    end--;
                }
            }
            if(start == end){
                A[i][start] = A[i][start] == 1? 0:1;
            }
        }
        return A;
    }
}
