/*
You have just rolled a dice several times. The N roll results that you remember are described by an array A.
However, there are F rolls whose results you have forgotten. 
The arithmetic mean of all the roll results equals M. What are the possible results of the missing rolls?

while A = {3, 2, 4, 3}, F = 2, M = 4 
ans --> {6, 6}

while A = {1, 5, 6}, F = 4, M = 3 
ans --> {3, 2, 2, 2}

while A = {1, 2, 3, 4}, F = 4, M = 6 
ans --> {0}

*/




import java.util.*;

public class MyClass {
    public static void main(String args[]) {
     Solution sol = new Solution();
     
     int[] ans1 = sol.missingRolls(new int[] {3, 2, 4, 3}, 2, 4);
     System.out.println("Ans1 = " + Arrays.toString(ans1));
     
     int[] ans2 = sol.missingRolls(new int[] {1, 5, 6}, 4, 3);
     System.out.println("Ans2 = " + Arrays.toString(ans2));
     
     int[] ans3 = sol.missingRolls(new int[] {1, 2, 3, 4}, 4, 6);
     System.out.println("Ans3 = " + Arrays.toString(ans3));
     
     int[] ans4 = sol.missingRolls(new int[] {6, 6}, 6, 3);
     System.out.println("Ans4 = " + Arrays.toString(ans4));
     
     int[] ans5 = sol.missingRolls(new int[] {3, 2, 4, 2}, 2, 4);
     System.out.println("Ans5 = " + Arrays.toString(ans5));
     
    }
}

class Solution{
    public int[] missingRolls(int[] A, int F, int M){
        
        int sumA = 0;
        for(int ele: A){
            sumA += ele;
        }
        
        int missingSum = M * (F + A.length) - sumA;
        double eachRollActual = missingSum / (double)F;
        int eachRoll = missingSum / F;
        int rem = missingSum % F;
        
        
        if(eachRollActual < 0 || eachRollActual > 6) return new int[] {0};
        
        int[] ans = new int[F];
        
        for(int i = 0; i < F; i++){
            ans[i] = eachRoll + (rem <= 0?0:1);
            rem--;
        }
        
        return ans;
    }
}

/*
OUTPUT :-

Ans1 = [6, 6]
Ans2 = [3, 2, 2, 2]
Ans3 = [0]
Ans4 = [2, 2, 2, 2, 2, 2]
Ans5 = [0]

*/
