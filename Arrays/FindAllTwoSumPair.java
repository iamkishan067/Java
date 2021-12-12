/*
Question ==> Find all the pairs which sums to target in the array

T.C. = O(n); //nlogn since sorting is also done
S.C. = O(n);

Intution => Storring the element in arrayList and comparing it with the difference

             

*/



import java.util.*;

public class MyClass {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      
      int n = scan.nextInt();
      scan.nextLine();
      
      int target = scan.nextInt();
      scan.nextLine();
      
      int[] arr = new int[n];
      
      for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
      }
      
      
      System.out.println(Arrays.deepToString(pairSum(arr, target)));
      
    }
    
    public static int[][] pairSum(int[] arr, int s) {
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            int diff = s - arr[i];
            if(temp.contains(Integer.valueOf(diff))){
                answer.add(new ArrayList<>(Arrays.asList(Integer.valueOf(diff), Integer.valueOf(arr[i]))) );
            }else{
                temp.add(Integer.valueOf(arr[i]));
            }
        }
        
        int n = answer.size();
        
        int[][] ans = new int[n][2];
        
        for(int i = 0; i < n; i++){
            int[] subArray = {answer.get(i).get(0), answer.get(i).get(1)};
            ans[i] = subArray;
        }
        
        java.util.Arrays.sort(ans, new java.util.Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });
        

        
        return ans;
    }

    
}



/*

 Arrays.sort(ans, new Comparator2D());
        
        return ans;
    }
    
}

class Comparator2D implements Comparator<int[]>{
    public int compare (int[] a, int[] b){
        return a[0] - b[0]; //a[1] - b[1];
    }
}



*/
