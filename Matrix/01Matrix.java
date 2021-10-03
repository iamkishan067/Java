
//Leetcode 542


import java.util.*;

public class Kishan{
    public static void main(String[] args){
        int[][] input = {{0, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        Solution sol = new Solution();
        System.out.println(Arrays.deepToString(sol.updateMatrix(input)));
    }
}



class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        
        int[][] ans = new int[m][n];
        LinkedList<Pair> list = new LinkedList<>();
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j] == 0){
                    ans[i][j] = 0;
                    list.addLast(new Pair(i,j));
                }else{
                    ans[i][j] = -1;
                }
            }
        }
        
        // System.out.println(Arrays.deepToString(ans));
        
        while(list.size() > 0){
            // for(Pair p : list){
            //     p.printString();
            // }
            // System.out.println();
            System.out.println(Arrays.deepToString(ans));
            Pair rem = list.removeFirst();
            int i = rem.x;
            int j = rem.y;
            
            //up
            if(i - 1 >= 0){
                if(ans[i - 1][j] == -1){
                    ans[i -1][j] = 1 + ans[i][j];
                    list.addLast(new Pair(i - 1,j));  
                } 
            }
            //down
            if(i + 1 < m){
                if(ans[i + 1][j] == -1){
                    ans[i + 1][j] = 1 + ans[i][j];
                    list.addLast(new Pair(i + 1,j));
                }
                
            }
            //left
            if(j - 1 >= 0){
                if(ans[i][j - 1] == -1) {
                    ans[i][j - 1] = 1 + ans[i][j];
                    list.addLast(new Pair(i,j - 1));
                }
                
            }
            //right
            if(j + 1 < n){
                if(ans[i][j + 1] == -1){
                    ans[i][j + 1] = 1 + ans[i][j];
                    list.addLast(new Pair(i,j + 1));
                }
            }
            
        }
        
        return ans;
    }
    
}

class Pair{
    int x;
    int y;
    public Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void printString(){
        System.out.print("(" + this.x + ", " + this.y + ") ===> ");
    }
}
