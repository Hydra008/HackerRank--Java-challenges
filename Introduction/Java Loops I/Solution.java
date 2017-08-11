import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i < 11; i++)
        {
            System.out.printf("%d x %d = %d",n,i,n*i);
            System.out.println();
        }
    }
}
