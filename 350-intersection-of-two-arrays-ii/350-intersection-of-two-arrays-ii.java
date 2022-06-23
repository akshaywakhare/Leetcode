class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
   List<Integer> a=new ArrayList<>();
        int[] c=new int[1001];
        for(int i:nums1){c[i]++;}
        for(int i:nums2){if(c[i]>0){
            c[i]--;
            a.add(i);
        }}
        
        int[] res=new int[a.size()];
        // for(int i=0;i<res.length;i++){res[i]=a.get(i);}
        //=a.toArray(new int[0]);
        // return res;//a.toArray(int[]::new);
        return  a.stream().mapToInt(i -> i).toArray();
 
    }
}