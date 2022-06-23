class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r*c!=mat[0].length*mat.length)return mat;
        if(r==mat.length)return mat;
        int[][] ans=new int[r][c];int a=0,b=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){//System.out.println(i+" "+j+" "+a+" "+b);
                if(a==mat.length)break; ans[i][j]=mat[a][b];
                b++;
                if(b==mat[0].length){b=0;a++;}
               
            }
        }
    return ans;}
}