//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            
            int matrix[][] = new int[n][n];
            
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.downwardDigonal(n, matrix);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static ArrayList<Integer> downwardDigonal(int n, int a[][])
    {
        // code here
        ArrayList<Integer> ans=new ArrayList<Integer>();
        // int count=0;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if((i+j)==count){
        //             downwardDigonal.add(a[i][j]);
        //         }
        //         //count++;
        //     }
        //     count++;
        // }
        int row=0, col=0;
        while(col<n){
            int r=row;
            int c=col;
            while(r<n && c>=0){
                ans.add(a[r][c]);
                r++;
                c--;
            }
            col++;
        }
        row=1;
        col=n-1;
        while(row<n){
            int r=row;
            int c=col;
            while(r<n && c>=0){
                ans.add(a[r][c]);
                r++;
                c--;
            }
            row++;
        }
        return ans;
    }
}
