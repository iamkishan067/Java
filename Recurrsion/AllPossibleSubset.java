import java.util.*;

public class Test{
    public static void main(String[] args){
        char[] str = {'a', 'b', 'c'};
        int N = 3;
        ArrayList<ArrayList<Character>> set = new ArrayList<ArrayList<Character>>();
        
        
        for(int mask = 0; mask < Math.pow(2, N); mask++){  // can use 1<<N instead of Math.pow(2,N)
            ArrayList<Character> subset = new ArrayList<>();
            for(int j = 0; j < N; j++){
                if((mask & (1 << j)) > 0){
                    subset.add(str[j]);
                }
            }
            set.add(subset);
        }
        System.out.println(set);
    }
}
