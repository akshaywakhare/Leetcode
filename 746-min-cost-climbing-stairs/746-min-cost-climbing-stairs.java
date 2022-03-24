class Solution {int[] dp;
    public int minCostClimbingStairs(int[] cost) {
       dp=new int[cost.length+1];
        return Math.min(help(0,cost ),help(1,cost));
    }
    public int help(int i,int[] c ){
        if(i>=c.length)return 0;
        if(dp[i]!=0)return dp[i];
        return dp[i]=c[i]+Math.min(help(i+1,c),help(i+2,c ));
    }
}