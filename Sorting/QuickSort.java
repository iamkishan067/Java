import java.util.Arrays;

public class QuickSort{
	public static int[] arr = {3, 5, 4, 1, 2};// making global declaration so that it can be accessed anywhere from
                                            // the program and we don't have to resend it everytime in funciton call
	
	public static void main(String[] args) {
		
		quickSort(0, arr.length - 1);
		System.out.println("Sorted Array : " + Arrays.toString(arr));
    
	}
	
	// QuickSort
	/*
	 * Time Complexity = O(nlogn)
	 * Stable = No --> because swapping of the element is at random
	 * Inplace = No --> because it uses recursion and recursion internally uses stack 
	 */
	
	public static void quickSort(int left, int right) {
		if(left < right) {
			int pivot = findPivot(left, right);
			quickSort(left, pivot -1);
			quickSort(pivot + 1, right);
		}
	}
	
	public static int findPivot(int left, int right) {
		int i = left;
		int j = right;
		int pivot = arr[left];
		
		while(i < j) {
			
			while(arr[i] <= pivot) i++;
			while(arr[j] > pivot) j--;
			
			if(i < j) swap(i, j);
		}
		
		swap(left, j);
		
		return j;
	}
	
	public static void swap(int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
}

//Output
//Sorted Array : [1, 2, 3, 4, 5]
