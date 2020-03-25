package leetcode;

import java.util.LinkedList;
import java.util.List;

public class leet_682 {

    public static int calPoints(String[] ops) {
        int sum =0;
        List<Integer> list = new LinkedList<>();
        for(String s : ops){
            if(s.equals("C")){
                list.remove(list.size()-1);
            }else if (s.equals("D")){
                list.add((list.get(list.size()-1))*2);
            }else if(s.equals("+")){
                list.add(list.get(list.size()-1)+list.get(list.size()-2));
            }else{
                list.add(Integer.parseInt(s));
            }
            
        }
        for(Integer i : list){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        
        String[] ops = {"5","-2","4","C","D","9","+","+"};
        
        int score = calPoints(ops);
        System.out.println(score);
    }

}
