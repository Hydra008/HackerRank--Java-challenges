import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
       PatternSyntaxException exception=null;
       String decision = "";
      while(testCases>0)
      {
         String pattern = in.nextLine();
          try
          {
          Pattern patterns = Pattern.compile(pattern);
          System.out.println("Valid");
          }
          catch(PatternSyntaxException e)
          {
           exception = e;
           System.out.println("Invalid");        
          }
          testCases--;
      }
   }
}
