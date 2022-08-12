class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] in=new int[numCourses];
        PriorityQueue<Integer> pq=new PriorityQueue<>( );
        for(int i=0;i<prerequisites.length;i++){
            in[prerequisites[i][0]]++;
        }
        for(int i=0;i<in.length;i++){
          if(in[i]==0)  pq.add(i);}
        // Set<Integer> s=new HashSet<>();
        while(pq.size()>0){
            int j=pq.poll(); 
            // if(s.contains(j))continue;
            // s.add(j);
            // if(in[j]>0)return false;
            
             for(int i=0;i<prerequisites.length;i++){
           if(prerequisites[i][1]==j){ in[prerequisites[i][0]]--; 
                                     if( in[prerequisites[i][0]]==0)pq.add( prerequisites[i][0]);}
        }
            
        }
         for(int i=0;i<in.length;i++){
          if(in[i]!=0) return false;}
        return true;
    }
}