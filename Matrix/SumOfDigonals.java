//LeetCode --> 1572
//T.C --> O(n)
//S.C --> O(1)


public class MyClass {
    public static void main(String args[]) {
      int[][] gain = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
      
      
      Solution sol = new Solution();
      int ans = sol.diagonalSum(gain);
      
      System.out.println("Sum of digonals element : " + ans);
      
    }
}

class Solution {
    public int diagonalSum(int[][] mat) {
        int i = 0;
        int j = 0;
        int n = mat.length;
        int ans = 0;
        
        while(i < n && j < n){
            ans += mat[i][j];
            i++;
            j++;
        }
        
        i = 0;
        j = n -1;
        
        while(i < n && j >= 0){
            ans += mat[i][j];
            i++;
            j--;
        }
        
        if(n % 2 != 0) ans -= mat[n/2][n/2];
        return ans;
    }
}
