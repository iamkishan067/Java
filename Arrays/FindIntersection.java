/*
Question ==> Find intersection between two arrays which are sorted in increasing order
             

*/



import java.util.*;

public class MyClass {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      
      int n = scan.nextInt();
      scan.nextLine();
      
      int m = scan.nextInt();
      scan.nextLine();
      
      ArrayList<Integer> al1 = new ArrayList<>();
      ArrayList<Integer> al2 = new ArrayList<>();
      
      for(int i = 0; i < n; i++){
            al1.add(i,scan.nextInt());
      }
      
      for(int i = 0; i < m; i++){
            al2.add(i,scan.nextInt());
      }
      
      
      System.out.println(findArrayIntersection1(al1, n, al2, m));
      
    }
    
    /*
    T.C. = O(max(m,n))
    S.C. = O(1)
    
    Intution =  using double for loop
    */
    
    public static ArrayList<Integer> findArrayIntersection1(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
	{
		ArrayList<Integer> al = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr1.get(i) < arr2.get(j)) break;
                
                if(arr1.get(i) == arr2.get(j)){
                    al.add(arr1.get(i));
                    arr2.remove(j);
                    arr2.add(j, -100000);
                    break;
                }
            }
        }
        
        return al;
	}
	
	
	/*
    T.C. = O(max(m,n))
    S.C. = O(1)
    
    Intution =  using double pointer
    */
	
	public static ArrayList<Integer> findArrayIntersection2(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
	{
		ArrayList<Integer> al = new ArrayList<>();
        int i = 0, j = 0;
        
        while(i < n && j < m){
            
            if(arr1.get(i) == arr2.get(j)){
                al.add(arr1.get(i));
                i++;
                j++;
            } else if (arr1.get(i) < arr2.get(j)){
                i++;
            }else{
                j++;
            }
        }
        return al;
	}

    
}
