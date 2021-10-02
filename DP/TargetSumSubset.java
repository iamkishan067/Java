import java.io.*;
import java.util.*;
import java.util.Arrays.*;
// Pepcoding --> Target Sum Subset
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        int[] coins = new int[n];
        
        for(int i = 0; i < n; i++){a
            coins[i] = scan.nextInt();
        }
        
        int target = scan.nextInt();
        
        boolean[][] dp = new boolean[n + 1][target + 1];
        
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= target; j++){
                if(i == 0 && j == 0) dp[i][j] = true;
                else if(i == 0) dp[i][j] = false;
                else if(j == 0) dp[i][j] = true;
                else{
                    if(j < coins[i -1]) dp[i][j] = dp[i - 1][j];
                    else{
                        if(dp[i-1][j] == true){
                            dp[i][j] = dp[i - 1][j];
                        }else{
                            if(dp[i -1][j - coins[i - 1]] == true){
                                dp[i][j] = true;
                            }else{
                                dp[i][j] = false;
                            }
                        }
                    }
                }
                
            }
        }
        
        // System.out.println(Arrays.deepToString(dp));
        
        System.out.println(dp[n][target]);
    }
}
