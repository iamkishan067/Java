/*
* Given a matrix source & destination print all the possible ways to go from source to destination
* Rule --> right & down are two valid moves
*/


import java.util.Arrays;
import java.util.Stack;
public class Test{
	static boolean[][] visited = new boolean[6][6];
	static int count = 0;
	
    public static void main(String[] args){
        
        System.out.println("All possible ways are :-");
        printAllPossibleWays(6, 6, 3, 3, 5, 5, new Stack<String>()); //(row_count, col_count, src_x, src_y, des_x, des_y, output);
        System.out.println("Total no. of ways = " + count);
    }
    
    
    
    public static void printAllPossibleWays(int m, int n, int src_x, int src_y, int des_x, int des_y, Stack<String> output){
        visited[src_x][src_y] = true;
        
        if(src_x == des_x && src_y == des_y){
            System.out.println(output);
            visited[src_x][src_y] = false;
            count++;
            return;
        }
        
        // Move Right
        if(safeToGo(src_x, src_y + 1, m, n)){
            output.push("R");
            printAllPossibleWays(m, n, src_x, src_y + 1, des_x, des_y, output);
            output.pop();
        }
        
        // Move Down
        if(safeToGo(src_x  + 1, src_y, m, n)){
            output.push("D");
            printAllPossibleWays(m, n, src_x + 1, src_y, des_x, des_y, output);
            output.pop();
        }
        
        // BackTracking --> removing this line will give unoverlapping paths
        visited[src_x][src_y] = false;
        
    }
    
    public static boolean safeToGo(int a, int b, int m, int n){
        if(a < m && a >= 0 && b < n && b >= 0 && visited[a][b] == false){
            return true;
        }
        
        return false;
    }
    
}


/*
Output :  

All possible ways are :-
[R, R, D, D]
[R, D, R, D]
[R, D, D, R]
[D, R, R, D]
[D, R, D, R]
[D, D, R, R]
Total no. of ways = 6

*/
