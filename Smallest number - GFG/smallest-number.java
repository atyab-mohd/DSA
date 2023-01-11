//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String[] inp=read.readLine().split(" ");
            int S=Integer.parseInt(inp[0]);
            int D=Integer.parseInt(inp[1]);

            Solution ob = new Solution();
            System.out.println(ob.smallestNumber(S,D));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static String smallestNumber(int S, int D){
        // code here
        if(S > 9*D) return "-1";
        int []no = new int[D];
        S--;
        for(int i=D-1;i>0;i--){
            if(S <= 9){
                no[i] = S;
                S = 0;
            }else{
                no[i] = 9;
                S -= 9;
            }
        }
        no[0] = S + 1;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<D;i++){
            char digit = (char) (no[i] + '0');
            sb.append(digit);
        }
        return sb.toString();
    }
}