//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int v = sc.nextInt();
                    int m = sc.nextInt();
                    int coins[] = new int[m];
                    for(int i = 0;i<m;i++)
                        coins[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minCoins(coins, m, v));
                }
        }
}    
// } Driver Code Ends


class Solution{
    public int minCoinsDP(int coins[], int M, int V, int dp[]) {
        if(V == 0) return 0;
	    
	    if(dp[V] != -1) {
	        return dp[V];
	    }
	    
	    int ans = Integer.MAX_VALUE;
	    int t;
	    for(int i = 0; i < M; i++) {
	        if(V - coins[i] >= 0) {
	            t = minCoinsDP(coins, M, V - coins[i], dp);
	            
	            if(t > -1) ans = Math.min(ans, 1 + t);
	        }
	    }
	    
	    if(ans == Integer.MAX_VALUE) 
	        return -1;
	        
	    dp[V] = ans;
	    return ans;
    }

	public int minCoins(int coins[], int M, int V) 
	{ 
	    // Your code goes here
	    int dp[] = new int[V+1];
	    for(int i = 0; i <= V; i++) {
	        dp[i] = -1;
	    }
	    
	    dp[0] = 0;
	    return minCoinsDP(coins, M, V, dp);
	    
	} 
}
