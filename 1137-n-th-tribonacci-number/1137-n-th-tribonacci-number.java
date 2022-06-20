class Solution {
    public int tribonacci(int n) {
         if(n==0||n==1)return n;
        if(n==2)return 1;
        int[] d=new int[n+1];
        d[0]=0;d[1]=1;d[2]=1;int i=3;
        while(true){
            d[i]=d[i-1]+d[i-2]+d[i-3];if(i==n)break;i++;
        }return d[i];
    }
}