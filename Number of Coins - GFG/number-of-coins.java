// { Driver Code Starts
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
}    // } Driver Code Ends


class Solution{
int[][] dp;
	public int minCoins(int coins[], int M, int V) 
	{ 
	    // Your code goes here
	    dp=new int[M+1][V+1];
	    for(int[] d:dp){
	        Arrays.fill(d,-1);
	    }
	    int res= helper(coins,0,V);
    if(res>=Integer.MAX_VALUE/2)return -1;
    return res;
	}
	

    public int helper(int[] c,int i,int s){
        if(i>=c.length)return Integer.MAX_VALUE-1;
        if(s==0)return 0;
        if(dp[i][s]!=-1)return dp[i][s];
        if(c[i]<=s)return dp[i][s]=Math.min(helper(c,i+1,s),1+helper(c,i,s-c[i]));
        else return dp[i][s]=helper(c,i+1,s);
    }
}