/*
Question ==> Find duplicate from an arr of size n where n - 1 elements are 1 to n - 1 
             and one remaining element is duplicate
             
T.C. = O(n)
S.C. = O(1)

Intution = XOR everything from 1 to n-1 and the remaining one is the duplicate one

*/



import java.util.*;

public class MyClass {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      
      int n = scan.nextInt();
      scan.nextLine();
      
      ArrayList<Integer> al = new ArrayList<>();
      
      for(int i = 0; i < n; i++){
          al.add(i, scan.nextInt());
      }
      
      
      
      System.out.println(findDuplicate(al));
      
    }
    
    
    public static int findDuplicate(ArrayList<Integer> arr) {

        int ans = 0;
        
		for(int i = 1; i < arr.size(); i++){
            ans = ans ^ arr.get(i) ^ i;
        }
        ans = ans ^ arr.get(0);
        return ans;
	}
    

    
}
