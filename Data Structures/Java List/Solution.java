import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            myList.add(sc.nextInt());
        }
        int querries = sc.nextInt();
        for(int i =0 ;i<querries;i++){
            String option = sc.next();
            if(option.contains("Insert")){
                int index = sc.nextInt();
                myList.add(index,sc.nextInt());
            }
            else {
                myList.remove(sc.nextInt());
            }
        }
        for(int i =0;i<myList.size();i++){
           System.out.print(myList.get(i)+" ");
        }
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
