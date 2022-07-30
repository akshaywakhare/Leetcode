class Solution {long[][] dp;double mod=Math.pow(10,9)+7;
    public int numRollsToTarget(int n, int k, int target) {
        dp=new long[n+1][target+1];
        for(long[] d:dp){Arrays.fill(d,-1);}
        double ans=solve(n,k,0,target)%mod;
        return (int)ans;
    }
     public long solve(int n, int k,int s, int target) {
        if(s==target&&n==0)return 1;
         if(s>target||n<=0)return 0;
        if(dp[n][s]!=-1)return dp[n][s];
         long m=0;
         for(int i=1;i<=k;i++){
             
             m+=solve(n-1,k,s+i,target)%mod;
         }
         return dp[n][s]=m;
     }
}