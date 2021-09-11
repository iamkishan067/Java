import java.util.*;

/*
 * This is dynamic array implementation.
 * 
 * c --> number of the element that an array can hold.
 * s --> number of the element an array is holding currently other than garbage value.
 * 
 * here the size of the array is increased to two times every time if c < s.
 * 
 * This is pretty much how ArrayList is implemented in java.
 * 
 */

public class DynamicArrayImpl {
    public static void main(String args[]) {
      int s = 0;
      int c = 0;
      int[] arr = new int[0];
      Scanner in = new Scanner(System.in);
      ArrayList<Integer> arr1 = new ArrayList<>();
      while(true){
          System.out.println("Enter a number : ");
          int x = in.nextInt();
          if(x == -1) break;
          
          if(c == 0){
              arr = null;
              arr = new int[1];
              arr[s++] = x;
              c = 1;
          }else{
              if(c > s){
                  arr[s++] = x;
              }else{
                  int[] newArray = new int[2 * c];
                  for(int i = 0; i < c; i++){
                      newArray[i] = arr[i];
                  }
                  
                  arr = newArray;
                  newArray = null;
                  arr[s++] = x;
                  c *= 2;
              }
          }
          System.out.println("C-" + c + " S-" + s );
      }
      System.out.println("C-" + c + " S-" + s );
      System.out.println(Arrays.toString(arr));
    }
}

/*

OUTPUT : 

Enter a number : 
1
C-1 S-1
Enter a number : 
2
C-2 S-2
Enter a number : 
3
C-4 S-3
Enter a number : 
4
C-4 S-4
Enter a number : 
5
C-8 S-5
Enter a number : 
6
C-8 S-6
Enter a number : 
7
C-8 S-7
Enter a number : 
8
C-8 S-8
Enter a number : 
9
C-16 S-9
Enter a number : 
-1
C-16 S-9
[1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0, 0, 0, 0, 0]

*/
