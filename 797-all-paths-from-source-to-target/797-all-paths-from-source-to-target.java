class Solution {int[][] adj;
                List<List<Integer>> ans=new ArrayList<List<Integer>>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        adj=graph;
        ArrayList<Integer> lb=new ArrayList<>();
        // lb.add(0);
              dfs(0,lb,graph.length-1);
        return ans;
    }
    public void dfs(int n,ArrayList<Integer> l,int d){
       l.add(n);
        if(n==d){
                ans.add(l);return;}
        for(int c:adj[n]){
           //ArrayList<Integer> ll=l;
            //ll.add(c);
            dfs(c,new ArrayList<Integer>(l),d);
        // l.remove(Integer.valueOf(c));
        }
    }                
}