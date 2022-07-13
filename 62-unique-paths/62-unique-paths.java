class Solution {int[][] dp;
    public int uniquePaths(int m, int n) {
        dp=new int[m+1][n+1];
        for(int[] d:dp){Arrays.fill(d,-1);}
        return helper(m,n,0,0);
    }
    public int helper(int m, int n,int i,int j) {
        if(i==m-1||j==n-1)return 1;
        if(dp[i][j]!=-1)return dp[i][j];
        return dp[i][j]=helper(m,n,i,j+1)+helper(m,n,i+1,j);
    }
}