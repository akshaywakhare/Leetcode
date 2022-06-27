class Solution {int[][] dp;
    public int rob(int[] nums) {
        // if(nums.length%2==0)
        return robs(nums);
        
    }
    public int robs(int[] nums) {
        if(nums.length==0)return 0;
        dp=new int[nums.length][2];
        for(int[]d:dp){Arrays.fill(d,-1);}
       return func(nums,0,0);
    }
                public int func(int[] n,int k,int f){
                    if(k>=n.length)return 0;
                    if(k==n.length-1){
                        if(f==1)return   0;
                        return n[k];
                    }
                    if(k!=n.length-1&&dp[k][f]!=-1)return dp[k][f];
                    if(k==0)return dp[k][f]=Math.max(n[k]+func(n,k+2,1),Math.max(func(n,k+2,0),func(n,k+1,0)));
                    
                    return dp[k][f]=Math.max(n[k]+func(n,k+2,f),func(n,k+1,f));
                }

}