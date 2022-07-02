class Solution {
      Map<Integer,Integer> map=new HashMap<>();
    int[]dp;
    public int deleteAndEarn(int[] nums) {
      int min=Integer.MAX_VALUE;
              int max=Integer.MIN_VALUE;
        for(int i:nums){
            if(map.containsKey(i))map.put(i,map.get(i)+1);
            else map.put(i,1);
            if(i>max)max=i;
            if(i<min)min=i;
        }
dp=new int[max+1];
        Arrays.fill(dp,-1);
        return helper(min,max);
        
    }
    
    public int helper(int i,int j){
        if(i>j)return 0;
        if(dp[i]!=-1)return dp[i];
        if(map.containsKey(i))return dp[i]=Math.max(map.get(i)*i+helper(i+2,j),helper(i+1,j));
    return helper(i+1,j);
        }
    
    
}