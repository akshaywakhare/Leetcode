/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        // int l=1,r=n,a=1;
        // while(l<=r){ if(isBadVersion(l)){a=l;break;}//{a=m;r=m-1;}
        //     int m=(l+r)/2;
        //     if(isBadVersion(m)){a=m;r=m-1;}
        //     else l=m+1;
        // }
        // return a;
            long l=1,r=(long)(n);
        while(l<=r){
            long mid = (l+r)/2;
            if(isBadVersion((int)mid))r = mid-1;
            else l = mid+1;
        }
        return (int)l;
    }
    }
