import java.util.*;

/*
* Leetcode --> (55) Jump Game
* In this problem you have to find whether you can reach to end of the array or not.
* Some of the sample cases with their answers
* 
* [0] ==> true
* [1, 0, 1, 0] ==> false
* [2, 0, 0] ==> true
* [3, 2, 1, 0, 4] ==> true
* [1, 2, 1, 4] ==> true
*/


public class CanYouReachEndOfArray{
    public static void main(String[] args){
        int[] arr = {2, 3, 0, 1, 3};
        
        Solution sol = new Solution();
        System.out.println(sol.canJump(arr));
    }
}

class Solution {
    public boolean canJump(int[] nums) {
        
        boolean[] canJumpArray = new boolean[nums.length];
        canJumpArray[0] = true;
        
        for(int i = 1; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                
                if(i <= (j + nums[j])){
                    if(canJumpArray[j] == true && i <= (nums[j] + j)){
                        canJumpArray[i] = true;
                    }
                }
            }
        }
        return canJumpArray[nums.length - 1];
    }
}

/*
OUTPUT : true
*/
