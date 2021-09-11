import java.util.*;

/*
* Given an array find if the sum of any two element is equal to the target.
*/

public class TwoSum{
    public static void main(String[] args){
        int[] arr = {1, 6, 8, 11, 15, 20};
        int n = arr.length;
        int t = 21;
        
        boolean ans1 = findTwoSum1(arr, t);
        System.out.println("Found Two Sum = " + ans1);
        
        int[] ans2 = findTwoSum2(arr, t);
        System.out.println(Arrays.toString(ans2));
        
    }
    
    
    /*
    * this is optimized method 
    * T.C. = O(n)
    * S.C. = O(n)
    */
    public static boolean findTwoSum1(int[] arr, int t){
        ArrayList<Integer> temp = new ArrayList<>();
        boolean found = false;
        
        for(int i = 0; i < arr.length; i++){
            int x = t - arr[i];
            if(!temp.contains(arr[i])){
                temp.add(x);
            }else{
                found = true;
                break;
            }
        }
        
        return found;
    }
    
    /*
    * this is two pointer method 
    * T.C. = O(n)
    * S.C. = O(1)
    */
    public static int[] findTwoSum2(int[] arr, int t){
        int s = 0;
        int e = arr.length - 1;
        
        while(s < e){
            int sum = arr[s] + arr[e];
            if(sum == t) return new int[] {s, e};
            if(sum < t) s++;
            else e--;
        }
        
        return new int[] {-1, -1};
    }
    
}
