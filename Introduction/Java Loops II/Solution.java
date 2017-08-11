import java.util.*;
import java.io.*;
import java.lang.Math.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int temp;
        
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int iteration1 = a + b;
            System.out.print(iteration1+" ");
            for (int j =1;j <= n-1; j++) //loop runs to n-1 as 1 iteration is already done
            {
                 double power = Math.pow (2,j);
                 int power1 = (int) power; //typecasting to integer
                 int result = iteration1 + power1*b;
                 iteration1 = result;
                 System.out.print(result + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
