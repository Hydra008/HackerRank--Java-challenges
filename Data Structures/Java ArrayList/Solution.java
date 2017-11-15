import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfArrays = sc.nextInt();
        ArrayList<int[]> listOfArrays = new ArrayList<int[]>(numberOfArrays);
        for(int i = 0; i<numberOfArrays; i++){
            int arraySize = sc.nextInt();
            int[] arr = new int[arraySize];
            for(int j = 0;j<arr.length;j++){
                arr[j] = sc.nextInt();
            }
            listOfArrays.add(arr);
        }
        int querries = sc.nextInt();
        for(int i = 0 ;i <querries;i++){
            int lineNumber = sc.nextInt();
            int[] line = listOfArrays.get(lineNumber-1);
            int index = sc.nextInt();
            if(index>line.length){
                System.out.println("ERROR!");
            } else
            {
                System.out.println(line[index-1]);
            }
        }
        
  
    }
}
