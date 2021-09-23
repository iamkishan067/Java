

public class MyClass {
    public static void main(String args[]) {
      String str = "GeeksforGeeks.";
  
        // Concatenation of two strings
        String gfg1 = String.format("My Company name is %s", str);
  
        // Output is given upto 8 decimal places
        String str2 = String.format("My answer is %030.8f", 47.65734);
  
        // between "My answer is" and "47.65734000" there are 15 spaces
        
        double d = 20.000000;
        String str3 = String.format("My answer is %015.8f", d);
  
        System.out.println(gfg1);
        System.out.println(str2);
        System.out.println(str3);
        
        String str1 = "Kishan", str4 = "Kandu";
        
        String k = String.format("%1$-9s%2$-9shello",str1,str4).replace(" ", "*");
        
        System.out.printf(k);
        
        
    }
}

//Output 
/*
My Company name is GeeksforGeeks.
My answer is 000000000000000000047.65734000
My answer is 000020.00000000
Kishan***Kandu****hello
*/

