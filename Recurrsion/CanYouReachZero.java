/*
 * Leetcode --> 1306. Jump Game III
 * 
 *  In this problem we are given with an array arr and a start point index.
 *  We can either go arr[index] forward or backward in the array.
 *  Finally we have to tell whether we can reach to zero or not.
 *  
 *  Input: arr = [4,2,3,0,3,1,2], start = 5
 *	Output: true
 *	Explanation: 
 *	All possible ways to reach at index 3 with value 0 are: 
 *  index 5 -> index 4 -> index 1 -> index 3 
 *	index 5 -> index 6 -> index 4 -> index 1 -> index 3
 *
 */



public class CanReachZeroInArray{
    public static void main(String[] args){
        int[] arr = {4, 4, 1, 3, 0, 3};
        
        Solution1 sol1 = new Solution1();
        System.out.println(sol1.canReach(arr, 2));
    }
}

/*
 * Solution in this approach we make one visited array and with the help recurrsion we get the answer.
 */
class Solution1 {
    public boolean canReach(int[] arr, int start) {
        boolean[] visited = new boolean[arr.length];
        
        return canReach1(arr, start, visited);
        
    }
    
    public boolean canReach1(int[] arr, int start, boolean[] visited) {
        if(arr[start] == 0) return true;
        
        visited[start]=true;
        
        boolean res1 = false;
        boolean res2 = false;
        
        if((start - arr[start]) >= 0 && (start - arr[start]) < arr.length  && (visited[start-arr[start]] == false))
        	res1 =  canReach1(arr, start - arr[start], visited);
            
        
        if((start + arr[start]) >= 0 && (start + arr[start]) < arr.length && (visited[start+arr[start]]==false))
        	res2 =  canReach1(arr, start + arr[start], visited);
             
        return (false || res1 || res2);
        
    }
}

/*
 * In this approach we don't use any extra space , we just make the visited index as negative.
 */


class Solution2 {
    public boolean canReach(int[] arr, int start) {
        if(start < 0 || start >= arr.length || arr[start] < 0 || arr[start] >= arr.length){
            return false;
        }

        arr[start] = -arr[start];
        
        return arr[start] == 0 || canReach(arr, start + arr[start]) || canReach(arr, start - arr[start]);
        
    }
}

