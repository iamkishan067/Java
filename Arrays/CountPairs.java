//Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.

/*
Example 1:

Input:
N = 4, K = 6
arr[] = {1, 5, 7, 1}
Output: 2
Explanation: 
arr[0] + arr[1] = 1 + 5 = 6 
and arr[1] + arr[3] = 5 + 1 = 6.

*/

/*
Example 2:

Input:
N = 4, X = 2
arr[] = {1, 1, 1, 1}
Output: 6
Explanation: 
Each 1 will produce sum 2 with any 1.

*/

public class CountPairs{
  public static void main(String args){
  int arr[] = {1, 5, 7, 1};
  int n = arr.length;
  int k = 6;
    
  Solution sol = new Solution();
  int result = sol.getPairsCount(arr, n, k);
  System.out.println("Result:" + result); 
    
  }
  
}

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        for(int ele : arr){
            map.put(ele, map.getOrDefault(ele , 0) + 1);
        }
        
        for(int ele: arr){
            int temp = k - ele;
            if(map.containsKey(temp)){
                count += map.get(temp);
                if(ele*2 == k) count--;
            }
        }
        
        return count/2;
        
    }
}
