//Leetcode ==> 1143

import java.util.Arrays;

public class MyClass {
    public static void main(String args[]) {
      String text1 = "abc";
      String text2 = "abcede";
      
      Solution sol = new Solution();
      int ans = sol.longestCommonSubsequence(text1, text2);
      
      System.out.println(ans);
    }
}

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];
        
        for(int i = 0; i < text1.length(); i++){
            Arrays.fill(dp[i], -1);
        }
        
        int ans = LCS(text1, text2, 0, 0, dp);
        
        return ans;
    }
    
    public int LCS(String text1, String text2, int i, int j, int[][] dp){
        
        if(i >= text1.length() || j >= text2.length()) return 0;
        
        if(dp[i][j] != -1) return dp[i][j];
        
        if(text1.charAt(i) == text2.charAt(j)) return 1 + LCS(text1, text2, i+1, j+1, dp);
        
        else{
            int left = LCS(text1, text2, i+1, j, dp);
            int right = LCS(text1, text2, i, j+1, dp);
            dp[i][j] = Math.max(left, right);
            return dp[i][j];
        }
        
        
    }
    
}

/*
Output : 
3
*/
