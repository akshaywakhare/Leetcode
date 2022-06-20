class Solution {
    public int fib(int n) {
        if(n==0||n==1)return n;
        int[] d=new int[n+1];
        d[0]=0;d[1]=1;int i=2;
        while(true){
            d[i]=d[i-1]+d[i-2];if(i==n)break;i++;
        }return d[i];
    }
}