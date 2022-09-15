class Solution {
    public int[] findOriginalArray(int[] changed) {
        Map<Integer,Integer> st=new HashMap<>();
        for(int i:changed){st.put(i,st.getOrDefault(i,0)+1);}
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(changed);
        for(int i:changed){
            if(st.get(i)>0&&st.containsKey(i*2)&&st.get(i*2)>0){ans.add(i);st.put(i,st.get(i)-1);st.put(i*2,st.get(i*2)-1);}
            else if(st.get(i)>0&&(!st.containsKey(i*2)||st.get(i*2)<1)) return new int[]{};
        }
         if(ans.size()!=changed.length/2) return new int[]{};
        return ans.stream().mapToInt(i->i).toArray();
    }
}