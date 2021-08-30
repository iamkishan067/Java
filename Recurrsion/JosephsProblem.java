/*
* Joseph's Problem is a problem in which we have to tell which man stand in the last. In this problem n no. of people standing in a circle. 
* The man with zero index has a gun and he shoots the people at kth position and then gives the gun to k+1 man. In this manner everyone kills 
* eachother and in the last who survived is the answer. 
*/



public class JosephsProblem{
    public static void main(String[] args){
        int ans = lastManStand(5,3); // lastManStand(no. of guys, no. of skip);
        System.out.println("Last man to stand = " + ans);
    }
    
    public static int lastManStand(int g, int k){
        if(g == 1){
            return 0;
        }
        
        return (lastManStand(g -1, k) + 3) % g;
    }
    
}
