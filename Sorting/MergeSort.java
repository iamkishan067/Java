import java.util.*;

public class MergeSort{
  public static void main(String[] args){
    int[] = {3, 1, 4, 5, 2};
    
    mergeSort(arr, 0, arr.length);
    System.out.println("Sorted Array: " + arr);
    
  }
  
  public static void mergeSort(int[] arr){
    
    if(left < right){
      
      int mid = left + (right - left)/2;
      
      mergeSort(arr, left, mid);
      mergeSort(arr, mid + 1, right);
      merge(arr, left, mid, right);
      
    }
 }
  
  /*
  * Time Complexity = O(nlogn)
  * Stable = Yes --> Because the swapping takes place only when one element is greater than other.
  * Inplace = No
  */
 
  public static void merge(int[] arr, int left, int mid, int right){
    
    int l_start = left;
    int r_start = mid + 1;
    int t = left;
    int[] temp = new int[arr.length];
    
    while(l_start <= mid && r_start <= right){
      
      if(arr[l_start] < arr[r_start]){
        temp[t++] = arr[l_start++];
      }else{
        temp[t++] = arr[r_start++];
      }
   }
    
    while(l_start <= mid){
      temp[t++] = arr[l_start++];
    }
    
    while(r_start <= right){
      temp[t++] = arr[r_start++];
    }
    
    System.arraycopy(temp, left, arr, left, t - left);
    
  }
} 
  //Output
  //Sorted Array: [1, 2, 3, 4, 5]
