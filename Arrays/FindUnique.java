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
      
      
      
      System.out.println(findUnique1(arr));
      
    }
    
    // T. C. = O(n)
    // S. C. = O(n)
  
    // intution ==> storing first occurence and then removing the next occurence --> finally leads to one and only unique element
    public static int findUnique(int[] arr){
    	ArrayList<Integer> al = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            
            if(!al.contains(Integer.valueOf(arr[i]))) al.add(arr[i]);
            else al.remove(Integer.valueOf(arr[i]));
            
            // System.out.println(al);
        }
        
        return al.get(0);
    }
  
  
    // T. C. = O(n)
    // S. C. = O(1)
    
    // intution ==> XOR everything will cancel out the duplicates and unique will be obtained
    public static int findUnique1(int[] arr){
    	int ans = 0; 
    	for(int i = 0; i < arr.length; i++){
    	    ans = ans ^ arr[i];
    	}
    	
    	return ans;
    }
    

    
}

