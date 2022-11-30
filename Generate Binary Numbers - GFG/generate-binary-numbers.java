//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])
    {
        //Taking input using class Scanner 
        Scanner sc = new Scanner(System.in);
        
        //Taking the number of testcases
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            //taking the range
            int n = sc.nextInt();
            
            //creating an ArrayList
            ArrayList<String> res = new ArrayList<String>();
            
            //calling the generate method of class solve
            //and storing the result in an ArrayList
            res = new solve().generate(n);
            
            //printing all the elements of the ArrayList
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends




class solve{
    static String getBinary(int num){
        StringBuilder sb= new StringBuilder();
            while(num>0){
            int rem= num%2;
            if(rem==0) sb.append("0");
            else sb.append("1");
            num/=2;
            }
            sb=sb.reverse();
            return sb.toString();
    }
    
    //Function to generate binary numbers from 1 to N using a queue.
    static ArrayList<String> generate(int N)
    {
        // Your code here
        ArrayList<String> arr= new ArrayList<>();
        for(int i=1;i<=N;i++){
            arr.add(getBinary(i));
        }
        return arr;
    }
    
}
