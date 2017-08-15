import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int length = s.length();
        ArrayList<String> combinations = new ArrayList<String>();
        for (int i = 0 ; i < length-k+1; i++)
        {
            combinations.add(s.substring(i,i+k));
            
        }        
        Collections.sort(combinations);
        //System.out.println(combinations);
        smallest = combinations.get(0);   
        largest = combinations.get(combinations.size()-1);        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
