/*
Input: n = 5
Output: 5
Explanation:
Here are the non-negative integers <= 5 with their corresponding binary representations:
0 : 0
1 : 1
2 : 10
3 : 11
4 : 100
5 : 101
Among them, only integer 3 disobeys the rule (two consecutive ones) and the other 5 satisfy the rule. 

Ex :-
Input: n = 1
Output: 2

Ex :-
Input: n = 2
Output: 3

*/


public class NonNegativeIntegersWithoutConsecutiveOnes {
    public static void main(String args[]) {
        Solution sol = new Solution();
        int res = sol.findIntegers(5);
        System.out.println(res);
    }
}

class Solution {
    public int findIntegers(int n) {
        int[] f = new int[31];
        f[0] = 1;
        f[1] = 2;
        for(int i = 2; i < 31; i++) {
            f[i] = f[i-1] + f[i-2];
        }
        
        int ans = 0;
        int k = 30;
        boolean pre_bit = false;
        
        while(k >= 0) {
            if((n & (1 << k)) > 0) {
                ans += f[k];
                if(pre_bit) return ans;
                pre_bit = true;
            }else {
                pre_bit = false;
            }
            k--;
        }
        return ans + 1;
    }
}


//OUTPUT ---> 5
