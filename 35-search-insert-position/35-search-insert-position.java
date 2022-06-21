class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0,r=nums.length-1,a=1;
        if(target<nums[0])return 0;
        if(target>nums[nums.length-1])return nums.length;
        while(l<=r){ 
            int m=(l+r)/2;
            if(nums[m]==target)return m;//;{a=m;r=m-1;}
            else if(nums[m]<target)l=m+1;
            else r=m-1;
        }
        return r+1;
    }
}