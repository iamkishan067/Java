import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;
import java.util.*;

//Pepcoding Printing Longest Increasing subsequence

/*
Input:
10
10 22 9 33 21 50 41 60 80 1
*/

public class Main {

  public static class Pair {
    int l;
    int i;
    int v;
    String psf;

    Pair(int l, int i, int v, String psf) {
      this.l = l;
      this.i = i;
      this.v = v;
      this.psf = psf;
    }
  }

  public static void solution(int []arr) {
    int n = arr.length;
    int[] dp = new int[n];
    Arrays.fill(dp, -1);

    dp[0] = 1;

    for (int i = 1; i < n; i++) {
      dp[i] = 1;
      for (int j = 0; j < i; j++) {
        if (arr[i] > arr[j] && dp[i] < dp[j] + 1) {
          dp[i] = dp[j] + 1;
        }
      }
    }
    
    
    int maxL = dp[0];
    for (int i : dp) {
      if (maxL < i) maxL = i;
    }

    System.out.println(maxL);

    ArrayDeque<Pair> stack = new ArrayDeque<>();
    for (int i = 0; i < n; i++) {
      if (dp[i] == maxL) {
        stack.add(new Pair(maxL, i, arr[i], arr[i] + ""));
      }
    }
    
    



    while (stack.size() > 0) {
      Pair rem = stack.removeFirst();
    //   System.out.println(rem.psf + "-----" + rem.l);

      if (rem.l == 1) System.out.println(rem.psf);

      for (int j = rem.i - 1; j >= 0; j--) {
        if (dp[j] == rem.l - 1 && arr[j] <= rem.v) {
          stack.add(new Pair(rem.l - 1, j, arr[j], arr[j] + " -> " + rem.psf));
        //   System.out.println(rem.psf);
        }
      }
    }


  }



  public static void main(String []args) {
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();

    int arr[] = new int[n];
    for (int i = 0 ; i < n ; i++) {
      arr[i] = scn.nextInt();
    }

    solution(arr);

    scn.close();
  }
}

/*
Output:
6
10 -> 22 -> 33 -> 41 -> 60 -> 80
10 -> 22 -> 33 -> 50 -> 60 -> 80
*/
