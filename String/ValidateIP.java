//468 --> leetcode

import java.util.regex.*;

public class ValidateIP{
  public static void main(String[] args){
    String IP = "172.16.254.1";// IPv4
    String IP1 = "2001:0db8:85a3:0:0:8A2E:0370:7334";// IPv6
    String IP2 = "2001:0db8:85a3:0:0:8A2E:0370:7334a";// Neither
    
    Solution sol = new Solution();
    
    String ans = sol.validIPAddress(IP2);
    System.out.println(ans);
  }
}


class Solution {
    public static String validIPAddress(String IP) {
        String IPv4 = "(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
        
        String IPv6 = "((([A-Fa-f0-9]){1,4})\\:){7}(([A-Fa-f0-9]){1,4})";
    
        if(Pattern.matches(IPv4,IP)) return "IPv4";
        else if(Pattern.matches(IPv6,IP)) return "IPv6";
        
        
        return "Neither";
    }
}
