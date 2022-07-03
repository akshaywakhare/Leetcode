class Solution {int[][]dp;
    public int minFallingPathSum(int[][] matrix) {
        int m=Integer.MAX_VALUE;
        dp=new int[matrix.length+1][matrix[0].length+1];
        for(int[] d:dp){Arrays.fill(d,-1);}
        
        for(int i=0;i<matrix[0].length;i++){
          m=Math.min( m,helper(0,i,matrix));
    }return m;}
        
                public int helper(int a,int b,int[][] matrix){
                    if(a<0||b<0||b>=matrix[0].length)return Integer.MAX_VALUE/2;
                    if(a>=matrix.length)return 0;
                       if(dp[a][b]!=-1)return dp[a][b];
                    return dp[a][b]=matrix[a][b]+Math.min(helper(a+1,b-1,matrix),Math.min(helper(a+1,b,matrix),helper(a+1,b+1,matrix)));
                }
}