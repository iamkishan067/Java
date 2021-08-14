

import java.util.*;
public class BubbleSort{
	public static void main(String[] args) {
		int[] arr = {3, 5, 8, 1, 4, 2, 0};

		int[] sortedArray0 = bubbleSort0(arr);
		System.out.println("Sorted Array : " + Arrays.toString(sortedArray0));
		
		int[] sortedArray1 = bubbleSort1(arr);
		System.out.println("Sorted Array : " + Arrays.toString(sortedArray1));
		
	}
	

	//bubble sort 
	/*
	 * Time Complexity = O(n^2)
	 * Stable = Yes  --> because swapping always takes place between adjacent element 
	 * Inplace = Yes
	 */
	
	public static int[] bubbleSort0(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - i -1; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		return arr;
	}
	
	//modified bubble sort 
	/*
	 * Time Complexity = O(n)
	 * Stable = Yes  --> because swapping always takes place between adjacent element 
	 * Inplace = Yes
	 */
	
	public static int[] bubbleSort1(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n - 1; i++) {
			boolean isSorted = true;
			for(int j = 0; j < n - i -1; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					isSorted = false;
				}
			}
			if(isSorted) {
				break;
			}
		}
		
		return arr;
	}
	
}



//Output
//Sorted Array : [0, 1, 2, 3, 4, 5, 8]

