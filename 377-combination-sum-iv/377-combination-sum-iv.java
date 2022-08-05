class Solution {
    Map<Integer,Long> map;
    public int combinationSum4(int[] nums, int target) {
        map=new HashMap<>();
        return (int)solve(nums,0,target);
    }
    long solve(int[] n,int ig,int s){
        if(s==0)return 1;
        // if(i>=n.length)return 0;
        if(s<0)return 0;
        if(map.containsKey(s))return  map.get(s);
        long temp=0;//solve(n,ig+1,s);
        for(int i:n){
            // if(i>s)break;
        temp+=solve(n,ig+1,s-i);
        }
        map.put(s,temp);
        return temp;
    }
}