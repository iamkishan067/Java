import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int[] arr = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        
        // System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sorted(arr)));
    }
    public static int[] sorted(int arr[]){
        int zero=0;
        int one=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            }
            else{
                one++;
            }
        }
        System.out.println(zero + " " + one );
        for(int i=0;i<arr.length;i++){
            if(zero>0){
                 arr[i]=0; 
                 zero--;
            }
            else{
                arr[i]=1;
                
            }
        }
        return arr;
    }
}
