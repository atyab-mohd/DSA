//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0)
        {
            int n = Integer.parseInt(in.readLine().trim());
            int A[] = new int[n];
            String s[]=in.readLine().trim().split(" ");
            for (int i = 0;i < n;i++)
            {
                A[i] = Integer.parseInt(s[i]);
            }
            int key = Integer.parseInt(in.readLine().trim());
            
            out.println(new Solution().search(A, 0, n - 1, key));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    int search(int A[], int l, int r, int key)
    {
        // l: The starting index
        // h: The ending index, you have to search the key in this range
        // Complete this function
        
        int mid=0, n=A.length;
        while(l<=r){
            mid=(l+r)/2;
            if(A[mid]<A[r]) r=mid;
            else if(A[mid]>A[r]) l=mid+1;
            else break;
        }
        int midIndex=mid;
        if(key>= A[midIndex] && key<=A[n-1]){
            l=midIndex;
            r=n-1;
        } else {
            l=0;
            r=midIndex-1;
        }
        return binarySearch(A, l, r, key);
    }
    static int binarySearch(int []a, int l, int r, int key){
        while(l<=r){
            int mid=l+(r-l)/2;
            if(a[mid]>key) r=mid-1;
            if(a[mid]<key) l=mid+1;
            if(a[mid]==key) return mid;
        }
        return -1;
    }
    
}