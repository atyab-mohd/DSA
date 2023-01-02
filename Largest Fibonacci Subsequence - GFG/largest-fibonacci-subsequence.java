//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            int getAnswer[] = obj.findFibSubset(a, n);
            int sz = getAnswer.length;
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<sz;i++)
                output.append(getAnswer[i]+" ");
            System.out.println(output);
            
        }
	}
}



// } Driver Code Ends


//User function Template for Java


class Solution {
    
    public int[] findFibSubset(int arr[], int n)
    {
        ArrayList<Integer> fibo = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int max = -1;
        for(int i=0;i<n;i++) max = Math.max(max, arr[i]);
        int a=0, b=1;
        while(b < max){
            int c = a + b;
            a = b;
            b = c;
            fibo.add(c);
        }
        for(int i=0;i<n;i++){
            if(fibo.contains(arr[i])) ans.add(arr[i]);
        }
        int []subset = new int[ans.size()];
        for(int i=0;i<ans.size();i++) subset[i] = ans.get(i);
        return subset;
    }
}