import java.util.*;

/*
* Given an array find if the sum of any two element is equal to the target.
*/

public class TwoSum{
    public static void main(String[] args){
        int[] arr = {1, 6, 8, 11, 15, 20};
        int n = arr.length;
        int t = 21;
        
        ArrayList<Integer> temp = new ArrayList<>();
        boolean found = false;
        
        for(int i = 0; i < n; i++){
            int x = t - arr[i];
            if(!temp.contains(arr[i])){
                temp.add(x);
                System.out.println(temp);
            }else{
                found = true;
                break;
            }
        }
        
        System.out.println(found);
        
    }
}
