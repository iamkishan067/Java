/*
 * In this problem you have to print your name 1000 times,
 * but the catch is that you're not allowed to any loop(like for, while, etc)
 */

public class Test{
    public static void main(String[] args){
        String name = "Kishan";
        String i = "i"; // length of i = 1
        i = i.replace("i", "iiiiiiiiii");// length of i = 1 x 10 = 10
        i = i.replace("i", "iiiiiiiiii");// length of i = 10 x 10 = 100
        i = i.replace("i", "iiiiiiiiii");// length of i = 100 x 10 = 1000
        i = i.replace("i", name + "\n");
        
        System.out.println(i);
    }
}
