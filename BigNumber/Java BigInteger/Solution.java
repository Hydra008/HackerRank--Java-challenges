import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n1,n2,sum,multiply;
        n1 = sc.nextBigInteger();
        n2 = sc.nextBigInteger();
        sum = n1.add(n2);
        multiply = n1.multiply(n2);
        System.out.println(sum);
        System.out.println(multiply);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
