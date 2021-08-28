/*
* here the problem is to print english translation of given integer 
* like 431 = Four Three One
*/

public class EnglishTranslation{
    public static void main(String[] args){
        String[] str = {"Zero ", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine "};
        int n = 4390;
        print(str, n);
    }
    
    static void print(String[] str, int n){
        if(n == 0){
            return;
        }
        print(str, n/10);
        System.out.print(str[n % 10]);
    }
}
