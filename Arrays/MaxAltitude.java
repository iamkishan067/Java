//Leetcode --> 1732

//T.C. --> O(n)
//S.C --> O(1)

public class MyClass {
    public static void main(String args[]) {
      int[] gain = {-5, 1, 5, 0, -7};
      
      Solution sol = new Solution();
      int ans = sol.largestAltitude(gain);
      
      System.out.println("Max altitude reached : " + ans);
      
    }
}

class Solution {
    public int largestAltitude(int[] gain) {
        int ans = 0;
        int maxSoFar = 0;
        
        for(int i = 0; i < gain.length; i++){
            ans += gain[i];
            maxSoFar = Math.max(maxSoFar, ans);
        }
        return maxSoFar;
    }
}
