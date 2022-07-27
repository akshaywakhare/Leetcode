class Solution {
    public int trap(int[] height) {
        int m =0;
        int[]r=new int[height.length];
        int[]l=new int[height.length];
        l[0]=height[0];r[height.length-1]=height[height.length-1];
        int max=height[0];
        for(int i=0;i<height.length;i++){ 
            if(max>height[i])l[i]=max;
            else l[i]=-1;
            max=Math.max(max,height[i]);
        }
           max=height[height.length-1];
        for(int i=height.length-1;i>=0;i--){ 
            if(max>height[i])r[i]=max;
            else r[i]=-1;
            max=Math.max(max,height[i]);
        }
         for(int i=0;i<height.length;i++){ 
             if(l[i]==-1||r[i]==-1)continue;
         m+=(Math.min(r[i],l[i])-height[i]);
         }
        
        
        return m;
    }
}