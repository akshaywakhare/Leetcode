class Solution {int max=Integer.MIN_VALUE;
    public int maxSubArray(int[] nums) {
        int curr=0;int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            curr+=nums[i];
            if(max<curr)max=curr;
            if(curr<0)curr=0;
        }
        return max;
}}