class Solution {
   int[][] dp;
    public int maximumScore(int[] nums, int[] multipliers) {
    dp=new int[nums.length+1][multipliers.length+1];
    for(int[] d:dp){Arrays.fill(d,Integer.MIN_VALUE);}
    return helper(nums,multipliers,0,0,nums.length);
    }
    public int helper(int[] n,int[]m,int i,int j,int nn){
        // if(i>j)return 0;
        if(j>=m.length)return 0;
        // String s=i+""+j+""+k;
        // if(map.containsKey(s))return map.get(s);
        if(dp[i][j]!=Integer.MIN_VALUE)return dp[i][j];
        int k=nn-1-(j-i);
      return  dp[i][j]=Math.max(helper(n,m,i+1,j+1,nn)+n[i]*m[j], n[k]*m[j]+helper(n,m,i,j+1,nn)); 
        
         
    }
}