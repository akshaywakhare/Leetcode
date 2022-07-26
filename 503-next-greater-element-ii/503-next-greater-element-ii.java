class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        Set<Integer> set=new HashSet<>();
        int[] res=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            st.push(nums[i]);
            if(set.contains(nums[i])) set.remove(nums[i]);
            else set.add(nums[i]);
        }
        for(int i=nums.length-1;i>=0;i--){
        while(!st.isEmpty()&&st.peek()<=nums[i]){st.pop();}
        if(!st.isEmpty())res[i]=st.peek();
        else res[i]=-1;
            
            st.push(nums[i]);
        }
        return res;
    }
}

 