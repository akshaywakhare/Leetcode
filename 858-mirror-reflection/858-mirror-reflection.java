class Solution {
    public int mirrorReflection(int p, int q) {
        int gcd=gcd(p,q);
        p/=gcd;q/=gcd;
        if(q%2==0)return 0;
        if(p%2==0)return 2;
        return 1;
    }
    int gcd(int p,int q){
        if(q==0)return p;
        return gcd(q,p%q);
    }
}