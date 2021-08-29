/* Printing all the permutation by using recurrsion concept.
*
*/

public class MyClass {
    static int count = 0;
    
    public static void main(String args[]) {
      String str = "ABCD";
      printPermutation(str, 0);
      System.out.println("Total no. of permutation = " + count);
    }
    
    public static void printPermutation(String str, int index){
        if(index >= str.length()){
            System.out.println(str);
            count++;
        }
        
        for(int i = index; i < str.length(); i++){
            str = swap(str, index, i);
            printPermutation(str, index + 1);
            //backtracking
            str = swap(str, index, i);
        }
        
    }
    
    public static String swap(String str, int i, int j){
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        return sb.toString();
    }
    
    
}


/*
OUTPUT :-
ABCD
ABDC
ACBD
ACDB
ADCB
ADBC
BACD
BADC
BCAD
BCDA
BDCA
BDAC
CBAD
CBDA
CABD
CADB
CDAB
CDBA
DBCA
DBAC
DCBA
DCAB
DACB
DABC
Total no. of permutation = 24
*/
