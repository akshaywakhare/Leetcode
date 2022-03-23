class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        if(nums.length<3)return ans;
        //-1 -1 0 1 2 4
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int j=i+1,k=nums.length-1,r=-1*nums[i];
            // while(nums[i]==nums[j]){j++;}
            // while(nums[k]==nums[j]){k--;}
            
           while(j<k){
            int s=nums[j]+nums[k];
               if(s==r){
               ans.add(Arrays.asList(nums[i],nums[j],nums[k])); j++;
            while(j<k&&nums[j-1]==nums[j]){j++;}

            }else if(s<r)j++;
            else k--;
           }
            while(i<nums.length-1&&nums[i+1]==nums[i]){i++;}
        }
        return ans;
    }
}