class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length-1;
                int m=matrix[0].length-1;

        if(target<matrix[0][0]||target>matrix[n][m])return false;
        int i=0;
        while(i<=n&&target>matrix[i][m]){i++;}
        int j=0;
        while(j<=m&&target>matrix[i][j]){j++;}
        return matrix[i][j]==target;
    }
}