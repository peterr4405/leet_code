package leetcode;

import java.util.HashSet;
import java.util.Set;



public class unique_email_adress_929 {
    
    public static void main(String[] args) {
        
    }
    
    
        public static int numUniqueEmails(String[] emails) {
        
            Set<String> set = new HashSet<>();
            
            for(String email: emails){
                int i = email.indexOf("@");
                String local = email.substring(0,i);
                String host = email.substring(i);
                
                if(local.contains("+")){
                    local = local.replace(local.substring(local.indexOf("+")),"" );
                }
                
                local = local.replace(".", "");
                set.add(local+host);
            }
            return set.size();
    }
}
