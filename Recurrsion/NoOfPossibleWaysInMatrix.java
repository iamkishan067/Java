/*
* Given the source and destination find the no. of possible ways to reach the destination 
* Rule --> Only possible moves are right and down
*/

public class Test{
    static int[][] dp = new int[10][10];
    
    public static void main(String[] args){
        
        int possibleWays = findAllPossibleWays(1, 1, 5, 5); // (source_x, source_y, destination_x, destination_y)
        System.out.println(possibleWays);
    }
    
    public static int findAllPossibleWays(int src_x, int src_y, int des_x, int des_y){
        des_x = des_x - src_x;
        des_y = des_y - src_y;
        return findAllPossibleWays1(des_x, des_y );
    }
    
    
    public static int findAllPossibleWays1(int m, int n){
        if(m == 0 || n == 0) return 1;
        if(dp[m][n] != 0) return dp[m][n];
        
        dp[m][n] = findAllPossibleWays1(m - 1, n) + findAllPossibleWays1(m, n -1);
        
        return dp[m][n];
    }
}

//Output : 70
