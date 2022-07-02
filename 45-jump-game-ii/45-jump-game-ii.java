class Solution {int[] dp;
    public int jump(int[] nums) {
           dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return helper(0,nums);
    }
                public int helper(int j,int[] nums){
                    if(j>=nums.length-1) return 0;
                    if(dp[j]!=-1)return dp[j];
                    
                    int min=Integer.MAX_VALUE/22;
                    for(int i=1;i<=nums[j];i++){
                    min=Math.min(min,helper(i+j,nums)   );
                    }
                return dp[j]=1+min;
                
    }
}