import java.util.*;

public class SelectionSort{
	public static void main(String[] args) {
		int[] arr = {3, 8, -3, 1, 5, 2, 4, 0};
		
		int[] sortedArray = selectionSort(arr);
		System.out.println("Sorted Array : " + Arrays.toString(sortedArray));
		
	}
	
	//Selection Sort
	/*
	 * Time Complexity = O(n^2)
	 * Stable = no --> because the swapping is taking place at random
	 * Inplace = yes
	 */
	
	public static int[] selectionSort(int[] arr) {
		int n = arr.length;
		
		for(int i = 0; i < n - 1; i++) {
			int min = i;
			for(int j = i + 1 ; j < n; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		
		return arr;
	}
}

// Output
//Sorted Array : [-3, 0, 1, 2, 3, 4, 5, 8]
