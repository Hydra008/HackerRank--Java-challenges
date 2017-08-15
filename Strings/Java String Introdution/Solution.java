import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
        int length = A.length()+B.length();
        System.out.println(length);
        char characterA = A.charAt(0);
       
        char characterB = B.charAt(0);
        if(A.compareTo(B)>0)
        {
           System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        char characterAu=Character.toUpperCase(characterA);
        String characterAupper = characterAu+A.substring(1,A.length());
        char characterBu=Character.toUpperCase(characterB);
        String characterBupper = characterBu+B.substring(1,B.length()); 
        System.out.println(characterAupper+" "+characterBupper);
    }
}
