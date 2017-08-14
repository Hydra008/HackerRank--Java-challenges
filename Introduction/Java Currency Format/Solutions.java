import java.util.*;
import java.text.*;
public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
               
       Locale locale = new Locale("en","US");
       NumberFormat us = NumberFormat.getCurrencyInstance(locale);
       Locale locale1 = new Locale("en","IN");
       NumberFormat india = NumberFormat.getCurrencyInstance(locale1);
       Locale locale2 = new Locale("zh","CN");
       NumberFormat china = NumberFormat.getCurrencyInstance(locale2);
       Locale locale3 = new Locale("fr","FR");
       NumberFormat france = NumberFormat.getCurrencyInstance(locale3);
       
        
        
        // Write your code here.
        
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
