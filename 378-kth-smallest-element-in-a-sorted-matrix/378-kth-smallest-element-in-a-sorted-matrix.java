class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                pq.add(matrix[i][j]);
         
        if(pq.size()>k)pq.poll();   }
        }
        if(pq.size()<k)return -1;
        // while(pq.size()!=1){pq.poll();}
        return pq.poll();
    }
}