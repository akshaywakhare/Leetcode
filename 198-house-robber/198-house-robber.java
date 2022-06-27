class Solution {int[] dp;
    public int rob(int[] nums) {
        if(nums.length==0)return 0;
        dp=new int[nums.length];
        Arrays.fill(dp,-1);
       return func(nums,0);
    }
                public int func(int[] n,int k){
                    if(k>=n.length)return 0;
                    if(dp[k]!=-1)return dp[k];
                    return dp[k]=Math.max(n[k]+func(n,k+2),func(n,k+1));
                }
}