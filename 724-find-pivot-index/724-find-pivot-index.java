class Solution {
    public int pivotIndex(int[] nums) {
     // int[] a=new int[nums.length];
     //    a[nums.length-1]=nums[nums.length-1];
     //    for(int i=nums.length-2;i>=0;i--){
     //        a[i]=nums[i]+a[i+1];
     //    }
        // if(a[0]==nums[0])return 0;
        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
          //  if(a[i]==nums[i])return i;
        }
        if(nums[nums.length-1]==nums[0])return 0;
        for(int i=1;i<nums.length;i++){
         if(nums[i]==nums[nums.length-1]-nums[i-1])return i;
          //  if(a[i]==nums[i])return i;
        }
        
        
        return -1;
    }
}    