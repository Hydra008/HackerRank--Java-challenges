import java.io.*;
import java.util.*;
public class Solution {
    static boolean isAnagram(String a, String b) {
        String aLower = a.toLowerCase();
        String bLower = b.toLowerCase();
        TreeMap<Character, Integer> counter = new TreeMap<Character, Integer>();
        TreeMap<Character, Integer> counterB = new TreeMap<Character, Integer>();
        for (int i = 0 ; i < a.length(); i++)          
        {
            if (counter.containsKey(aLower.charAt(i)))
            {
                counter.put(aLower.charAt(i),counter.get(aLower.charAt(i))+1); 
            }
            else
            {               
                counter.put(aLower.charAt(i),1);
            }
        }
        for (int i = 0 ; i < b.length(); i++)          
        {
            if (counterB.containsKey(bLower.charAt(i)))
            {
                counterB.put(bLower.charAt(i),counterB.get(bLower.charAt(i))+1); 
            }
            else
            {               
                counterB.put(bLower.charAt(i),1);
            }
        }
        //System.out.println(counter);
        //System.out.println(counterB);
        boolean result = counter.equals(counterB);
        // Complete the function
        return result;
        }
        public static void main(String[] args) 
        {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
