import java.util.Arrays;

public class SieveOfEratosthenes{
    public static void main(String[] args){
        boolean[] isPrime = sieveOfErastosthenes(1000);
        
        int i = 0;
        for(boolean ele: isPrime){
            System.out.println(i + "-->" +ele);
            i++;
        }
    }
    
    public static boolean[] sieveOfErastosthenes(int n){
        boolean[] isPrime = new boolean[n];
        
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        
        for(int i = 2; i * i <= n; i++){
            for(int j = i * 2; j < n; j += i){
                isPrime[j] = false;
            }
        }
        
        return isPrime;
    }
    
}
