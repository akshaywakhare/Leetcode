class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
         // if(obstacleGrid[0][0]==1)return 0;
        return uniquePaths(obstacleGrid.length,obstacleGrid[0].length,obstacleGrid);
    }
    int[][] dp;
    public int uniquePaths(int m, int n,int[][] obstacleGrid) {
        dp=new int[m+1][n+1];
        for(int[] d:dp){Arrays.fill(d,-1);}
        return helper(m,n,0,0,obstacleGrid);
    }
    public int helper(int m, int n,int i,int j,int[][] obstacleGrid) {
        if(i>m-1||j>n-1)return 0;
        if(obstacleGrid[i][j]==1)return 0;
        
        if(i==m-1&&j==n-1)return 1;
        if(dp[i][j]!=-1)return dp[i][j];
        return dp[i][j]=helper(m,n,i,j+1,obstacleGrid)+helper(m,n,i+1,j,obstacleGrid);
    }
}