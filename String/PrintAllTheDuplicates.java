import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PrintAllTheDuplicates {

  //find the duplicates character repeated in the sentence and print their counts
	public static void main(String[] args) {
		String str = "the demo string";
		method1(str);
		method2(str);
	}
  
  //method1
	private static void method1(String str) {
		final int total_char = 256;
		
		int[] count = new int[total_char];
		
		//filling the count array with the number of characters
		for(int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}
		
		System.out.println("Method 1:-");
		
		//printing all the duplicates with count more than 1
		for(int i = 0; i < total_char; i++) {
			if(count[i] > 1) {
				System.out.println((char)i + " => count = " + count[i]);
			}
		}
		
	} 
	
  //method2
	private static void method2(String str) {
		Map<Character, Integer> map = new HashMap<>();
			
		//storing count of the character in map
		for(int i = 0; i < str.length(); i++) {
			if(!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), 1);
			}else {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			}
		}
		
		System.out.println("Method 2:-");
		
		// printing all the duplicates with count more than 1
		for(Entry<Character, Integer> mapEle: map.entrySet()) {
			if(mapEle.getValue() > 1) {
				System.out.println(mapEle.getKey() + " => count = " + mapEle.getValue());
			}
		}

	}

}
