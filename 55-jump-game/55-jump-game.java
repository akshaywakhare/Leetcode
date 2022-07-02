class Solution {int dp[];
    public boolean canJump(int[] nums) {
        dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return helper(0,nums)==1;
    }
                public int helper(int j,int[] nums){
                    if(j>=nums.length-1) return 1;
                    if(dp[j]!=-1)return dp[j];
                    for(int i=1;i<=nums[j];i++){
                        if(helper(j+i,nums)==1)return dp[j]=1;
                    }
                return dp[j]=0;
                }
}