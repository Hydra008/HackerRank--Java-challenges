import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String reverse = "";
        int length = A.length();
       
        for(int i = length;i>0;i--)
        {   
            String temp = Character.toString(A.charAt(i-1));
            reverse = reverse + temp;    
        }
        if(reverse.equals(A))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        /* Enter your code here. Print output to STDOUT. */
        
    }
}
