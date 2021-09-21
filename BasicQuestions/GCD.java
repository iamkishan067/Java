public class MyClass {
    public static void main(String args[]) {
      
      int z = findGCD1(36, 60);

      System.out.println("GCD = " + z);
    }
    
    public static int findGCD(int a, int b){
        if(a == 0 || b == 0) return 0;
        
        if(a == b) return a;
        
        if(a > b) return findGCD(a - b, b);
        else return findGCD(a, b - a);
    }
    
    public static int findGCD1(int a, int b){
        if(a == 0) return b;
        else return findGCD(b % a, a);
    }
    
}
