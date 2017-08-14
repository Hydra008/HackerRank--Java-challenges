import java.util.Scanner;
import java.util.Calendar;
public class Solution {
    public static String getDay(String day, String month, String year) {
        /*
        * Write your code here.
        */
        String[] days =
         {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int day1 =Integer.parseInt(day);
        int month1 =Integer.parseInt(month);
        int year1=Integer.parseInt(year);
        Calendar calendar = Calendar.getInstance();
		    calendar.set(year1, month1-1, day1-1); //January is counted as 0 and Sunday is Counted as 0
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        return days[dayOfWeek-1].toUpperCase();// -1 as days are in array starting from index 0
    }
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
    }
}
