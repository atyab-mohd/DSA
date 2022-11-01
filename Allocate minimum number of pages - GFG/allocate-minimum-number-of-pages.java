//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]a,int n,int m)
    {
        //Your code here
        int low=-1, high=0;
        for(int i=0;i<n;i++){
            high+=a[i];
            // if(a[i]<low){
            //     low=a[i];
            // }
            low=Math.max(low,a[i]);
        }
        if(m>n){
            return -1;
        }
        int ans=low;
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(a,m,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    static boolean possible(int []a, int stud, int max){
        int students=1, currSum=0;
        for(int i=0;i<a.length;i++){
            currSum+=a[i];
            if(currSum>max){
                students++;
                currSum=a[i];
            }
            if(students>stud) return false;
        }
        return true;
    }
};