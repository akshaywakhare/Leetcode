class Solution {int vis[]; ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
    public boolean validPath(int n, int[][] edges, int source, int destination) { 
        for(int i=0;i<=n;i++){adj.add(new ArrayList<Integer>());}
        
        for(int i=0;i<edges.length;i++){
        
            adj.get(edges[i][0]).add(edges[i][1]);
            
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        vis=new int[n];
        return dfs(source,destination);
    }
                boolean dfs(int s,int d){
                    if(s==d)return true;
                    vis[s]=1;
                    for(int c:adj.get(s)){
                        if(vis[c]==0)if(dfs(c,d))return true;
                    }
                return false;}
}