public class GcdOfStrings {
    public static void main(String args[]) {
        
        String a = "ABAB";
        String b = "ABABABABAB";
      
      String ans = findGCD(a, b);
      
      System.out.println("GCD = "+ ans);
    
      
    }
    
    public static String findGCD(String a, String b){
        if(a.equals("") || b.equals("")) return a;
        
        if(a.equals(b)) return a;
        
        if(a.length() > b.length()){
            if(a.substring(0, b.length()).equals(b)){
                return findGCD(a.substring(b.length(), a.length()), b);
            }else{
                return "";
            }
        }else{
            if(b.substring(0, a.length()).equals(a)){
                return findGCD(a, b.substring(a.length(), b.length()));
            }else{
                return "";
            }
        }
        
    }
    
}
