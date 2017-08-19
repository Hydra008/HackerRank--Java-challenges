import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();
                //Write your code here
        List<BigDecimal> bd = new ArrayList<BigDecimal>();
        for (int i = 0; i < n-1; i++)
        {
            //bd.add(new BigDecimal(s[i]));
            for(int j =0; j<n-i-1;j++)
            {
                if(new BigDecimal(s[j]).compareTo(new BigDecimal(s[j+1]))==-1)
                {
                    String temp = s[j+1];
                    s[j+1]=s[j];
                    s[j]=temp;
                }              
            }
        }
                //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}
