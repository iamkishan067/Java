/*
 * In this problem we have to find the minimum jump to reach end of the array
 */



import java.util.*;

public class Test{
    public static void main(String[] args){
        int[] arr = {2, 1, 3, 2, 3, 4, 5, 1, 2, 8};
        findMinJump(arr);
    }
    
    public static void findMinJump(int[] arr){
        
        int[] minJumpArray = new int[arr.length]; // contains info about minmum jump to reach the index
        Arrays.fill(minJumpArray, Integer.MAX_VALUE);
        minJumpArray[0] = 0;
        
        int[] jumpPathArray = new int[arr.length]; // conatins info about from which index the jump took place to the current index
        
        for(int i = 1; i < arr.length; i++){
            for(int j = 0; j < i; j++){
                if(i <= (j + arr[j])){
                    if((minJumpArray[j] + 1) < minJumpArray[i]){
                        minJumpArray[i] = minJumpArray[j] + 1;
                        jumpPathArray[i] = j;
                    }
                }
            }
        }
        
        System.out.println("Minimum jumps to reach the end = " + minJumpArray[arr.length - 1]);
        
        System.out.print("Path to reach the destination : ");
        printPath(jumpPathArray, arr.length -1);
    }
    
    public static void printPath(int[] arr, int index){
        if(index == 0){
            return;
        }
        
        printPath(arr, arr[index]);
        System.out.print(arr[index] + " ");
    }
}    


/*
Output : 

Minimum jumps to reach the end = 3
Path to reach the destination : 0 2 5 

*/
