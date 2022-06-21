class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Arrays.sort(nums);
        int i=0;
        
       for(;i<nums.length-1;i++){
           for(int j=i+1;j<nums.length;j++){
                 int s=nums[i]+nums[j];//System.out.println(s);
            if(s==target)return new int[]{i,j};
           }
       }
      
            
        
           return new int[]{-1,-1};
    }
}