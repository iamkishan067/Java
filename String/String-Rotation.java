//This program checks if the given two string are rotation of each other or not
public class StringRotation {

	public static void main(String[] args) {
    
		String[][] pairs = {{"apple", "pplea"}, {"ball", "llba"}, {"aeroplane", "planeearo"}};
		System.out.println("Result: \n");
    
		for(String[] pair: pairs) {
			String s1 = pair[0];
			String s2 = pair[1];
			boolean result = isRotation(s1,s2);
			System.out.println(s1 + " " + s2 + " : " + result);
		}

	}
	
	public static boolean isRotation(String s1, String s2) {
    
		int len1 = s1.length();
    
		if(len1 == s2.length() && len1 != 0) {	
			String s1s1 = s1+s1; // this doubles the s1(apple) to s1s1(appleapple)
			boolean result = isSubstring(s1s1, s2);
			return result;
		}
    
		return false;
    
	}

	public static boolean isSubstring(String s1s1, String s2) {
    
		if(s1s1.indexOf(s2) >= 0){ // this checks if pplea is in appleapple or not
      return true;
    }else{ 
      return false;
   }    
    
	}

}

