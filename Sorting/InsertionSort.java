import java.util.*;

public class InsertionSort{
	public static void main(String[] args) {
		int[] arr = {3, 5, 1, 4, 2};
		
		int[] sortedArray = insertionSort(arr);
		System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
	}
	
	//Insertion Sort
	/*
	 * Time Complexity = O(n log n)
	 * Stable = Yes --> because swapping always takes place between adjacent element 
	 * Inplace = Yes
	 */
	
	public static int[] insertionSort(int[] arr) {
		int n = arr.length;
		for(int i = 1; i < n; i++) {
			int v = arr[i];
			int j = i;
			while((j-1) >= 0 && arr[j-1] > v) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = v;
		}
		
		return arr;
	}
}

//Output
//Sorted Array : [1, 2, 3, 4, 5]
