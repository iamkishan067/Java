/*
* Find the missing least number.
* Eg. arr[1, 2, 0]
* ans = 3
* 
* arr[3, 9, -1, 1]
* ans = 2
* 
* Eg. arr[7, 8, 9. 11, 12]
* ans = 1
*/


public class MyClass {
    public static void main(String args[]) {
      System.out.println(findMissingLeastNumber(new int[] {7, 8, 9, 11, 17, 19, 1}));
    }
    
    public static int findMissingLeastNumber(int[] arr){
        int n = arr.length;
        int count1 = 0;
        
        // checking if 1 is missing 
        for(int i = 0; i < n; i++){
            if(arr[i] == 1){
                count1++;
                break;
            }
        }
        
        if(count1 == 0) return 1;
        
        // removing the elements which are not contributing to the answer
        for(int i = 0; i < n; i++){
            if(arr[i] <= 0 || arr[i] > n){
                arr[i] = 1;
            }
        }
        
        
        // taking the value at current element as index and marking it as negative
        for(int i = 0; i < n; i++){
            int a = Math.abs(arr[i]);
            
            if(a == n){
                arr[0] = -Math.abs(arr[0]);
            }else{
                arr[a] = -Math.abs(arr[a]);
            }
        }
        
        // if value at any index is not negative then that index is our answer coz it is least missing
        for(int i = 1; i < n; i++){
           if(arr[i] > 0){
               return i;
           }
        }
        
        // we have kept 0th element as indicator for the presence of n
        if(arr[0] > 0) return n;
        
        // here the answer will be in the range 1 to n+1
        // since 1 is present and n is also present so answer is n+1
        return n + 1;
    }
    
}
