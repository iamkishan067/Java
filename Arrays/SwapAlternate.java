/*

Time Complexity = O(n / 2)

Space Complexity = O(1)

Intution => swap and increment by 2

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
      
      swapAlt(arr, n);
      
      System.out.println(Arrays.toString(arr));
    }
    
    public static void swapAlt(int[] arr, int n){
        if(n % 2 == 1){
          for(int i = 0; i < n - 1; i+=2){
              int temp = arr[i];
              arr[i] = arr[i + 1];
              arr[i + 1] = temp;
          }
      }else{
          for(int i = 0; i < n; i+=2){
              int temp = arr[i];
              arr[i] = arr[i + 1];
              arr[i + 1] = temp;
          }
      }
    }
    
}
