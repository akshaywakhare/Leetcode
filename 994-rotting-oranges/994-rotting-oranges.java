class Solution {
    public int orangesRotting(int[][] grid) {
        int res=0,ap=0;
        Queue<Integer[]> q=new LinkedList<Integer[]>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){q.offer(new Integer[]{i,j});grid[i][j]=1;}
                if(grid[i][j]==1)ap++;
            }
        }if(ap==0)return 0;
        if(q.size()==0)return -1;
     q.offer(new Integer[]{-1,-1});
        // return q.size();//
        while(true ){
            Integer[] node=q.poll();
            int a=node[0];
            int b=node[1];
            if(a==-1&&b==-1){
                             if(q.isEmpty())break;
                res++;
                             q.offer(new Integer[]{-1,-1});continue;}
            if(a<0||b<0||a>=grid.length||b>=grid[0].length||grid[a][b]!=1)continue;
            grid[a][b]=2; 
            q.offer(new Integer[]{a,b+1});
            q.offer(new Integer[]{a,b-1});
            q.offer(new Integer[]{a+1,b});
            q.offer(new Integer[]{a-1,b});
        }
         for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1)return -1;
            }
        }
        return res-1;
    }
}