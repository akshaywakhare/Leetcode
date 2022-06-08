class Solution {
    public int maxDistToClosest(int[] seats) {
        int f=0,l=0,m=0;
        
        for(int i=0;i<seats.length;i++){
         if(seats[i]==1){f=i;break;}   
        }
        int p=0;
        for(int i=f;i<seats.length;i++){
         if(seats[i]==1){m=Math.max(m,i-p-1);  p=i;}   
        }
        for(int i=seats.length-1;i>=0;i--){
         if(seats[i]==1){l=seats.length-1-i;break;}   
        }
        if(m%2==0)m/=2;
        else m=m/2+1;
        return Math.max(f,Math.max(l,m));
    }
}