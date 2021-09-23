import java.util.*;
import java.io.*;
import java.time.LocalDate;

public class MyClass {
    public static void main(String args[]) {
       
       Scanner in = new Scanner("8 5 2015");
       
       int mm = Integer.parseInt(in.next());
       int dd = Integer.parseInt(in.next());
       int yyyy = Integer.parseInt(in.next());
       
       String day = findDay1(mm, dd, yyyy);
       
       
       System.out.println(day);
    }
    
    public static String findDay1(int mm, int dd, int yyyy){
      return LocalDate.of(yyyy, mm, dd).getDayOfWeek().name();
   }
    
    public static String findDay(int mm, int dd, int yyyy){
        String d = String.format("%02d/%02d/%02d", mm, dd, yyyy);
        Date date = new Date(d);
        
        System.out.println(date);
        Scanner scan = new Scanner(date + "");
        String day = scan.next();
        
        String[] Days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday"};
        
        for(String ele: Days){
            if(ele.startsWith(day)){
                day = ele;
                break;
            } 
        }
        
        return day;
    }
}

/*
OUTPUT : 

Wed Aug 05 00:00:00 GMT 2015
Wednesday
*/
