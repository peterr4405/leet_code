package leetcode;

import java.util.LinkedList;
import java.util.Queue;



public class leet_821 {

    public static int[] shortestToChar(String S, char C) {
        /*
         int[] ans= new int[S.length()];
        int flag =0;
        for(int i =0; i<S.length();i++){
            if(S.charAt(i) == C){
                ans[i]= 0;
                flag =1;
                }else if(flag ==0){
                ans[i] = Integer.MAX_VALUE;
            }else
             ans[i] = ans[i-1]+1;
        }
        
        for(int i = S.length()-2;i>=0;i--){
            if(S.charAt(i) == C)
                ans[i]= 0;
            else
                ans[i] = Math.min(ans[i],ans[i+1]+1);
        }
        
        return ans;
        */
          int ans[]=new int[S.length()];
        Queue<Integer>queue=new LinkedList<>();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)==C){
                queue.add(i);
            }
        }
        int pre=Integer.MAX_VALUE;
        for(int i=0;i<S.length();i++){
            if(queue.size()!=0&&i<queue.peek()){
                ans[i]=(int)Math.min(Math.abs(pre-i),Math.abs(queue.peek()-i));
                continue;
            }
            if(queue.size()!=0&&i==queue.peek()){
                ans[i]=0;
                pre=queue.poll();
                continue;
            }
            if(queue.size()==0){
                ans[i]=Math.abs(i-pre);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        /*321010012210*/
        char c = 'e';
        int[] a = shortestToChar(s, c);
        for (int i : a) {
            System.out.println(i);
        }
    }

}
