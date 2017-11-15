import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int negatives = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = 1; j<=arr.length; j++){
                if(i<j){
                int[] subArray = Arrays.copyOfRange(arr, i, j);
                int sum =0;
                for(int k=0;k<subArray.length;k++){
                    sum = sum + subArray[k];
                }
                if(sum<0){
                    negatives++;
                }
                }
            }
        }
        System.out.println(negatives);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
