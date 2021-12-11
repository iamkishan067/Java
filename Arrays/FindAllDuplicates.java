/*
LeetCode 442
Question ==> Given an integer array nums of length n where all the integers of nums 
             are in the range [1, n] and each integer appears once or twice, return 
             an array of all the integers that appears twice.
             
             You must write an algorithm that runs in O(n) time and uses only
             constant extra space.
             
T.C. = O(n)
S.C. = O(1)

Intution =  negative at index for visited element

*/



import java.util.*;

public class MyClass {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      
      int n = scan.nextInt();
      scan.nextLine();
      
      int[] arr = new int[n];
      
      for(int i = 0; i < n; i++){
          arr[i] = scan.nextInt();
      }
      
      
      
      System.out.println(findAllDuplicates(arr));
      
    }
    
    
    public static List<Integer> findAllDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] < 0) list.add(index + 1);
            nums[index] = -nums[index];
        }
        
        return list;
    }
    

    
}
