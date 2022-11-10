//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            
            //taking input n
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution ob = new Solution();
            
            //calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        long psarr[]= new long[n];
        psarr[0]=arr[0];
        for(int i=1;i<n;i++){
            psarr[i]= psarr[i-1]+ arr[i];
        }
        
        for(int i=0;i<n;i++){
            // if(i==0){
            //     left_sum=0;
            //     right_sum=psarr[n]-psarr[0];
            // }
            // left_sum= psarr[i-1];
            // right_sum= psarr[n]- psarr[i+1];
            // if(left_sum==right_sum) return i+1;
            long left_sum= psarr[i]-arr[i];
            long right_sum= psarr[n-1]- psarr[i];
            if(left_sum==right_sum) return i+1;
        }
        return -1;
    }
}
