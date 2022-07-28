class Solution {int[][] dp;
    public int longestPalindromeSubseq(String s) {
          StringBuilder input1 = new StringBuilder();
  dp=new int[s.length()+1][s.length()+1];
        // append a string into StringBuilder input1
        input1.append(s);
  
        // reverse StringBuilder input1
        input1.reverse();
        return longestCommonSubsequence(s,input1.toString());
    }
     public int longestCommonSubsequence(String text1, String text2) {
        dp=new int[text1.length()+1][text2.length()+1];
        for(int[] d:dp){Arrays.fill(d,-1);}
        return solve(0,0,text1,text2);
    }
    
    public int solve(int i,int j,String s, String r) {
        if(i>=s.length()||j>=r.length())return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s.charAt(i)==r.charAt(j))return dp[i][j]=1+solve(i+1,j+1,s,r);
        else return dp[i][j]=Math.max(solve(i,j+1,s,r),solve(i+1,j,s,r));
    } 
}