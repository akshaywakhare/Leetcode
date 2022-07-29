class Solution {ArrayList<int[]> ans;int m=Integer.MIN_VALUE;
    public int[] maxSubsequence(int[] nums, int k) {
        ans=new ArrayList<>();
        
        PriorityQueue<int[]> pq=new PriorityQueue<>((s,b)->((int[])b)[1]-((int[])s)[1]);
        
        for(int i=0;i<nums.length;i++){
            pq.offer(new int[]{i,nums[i]});
        }  
        for(int i=0;i<k;i++){
           ans.add(pq.poll());
        }
        Collections.sort(ans,new Comparator<int[]>(){
             public int compare(int[] a,int[] b){
                return  a[0]-b[0];
            }
        });
               int[] res=new int[k];
          for(int i=0;i<k;i++){
              res[i]=ans.get(i)[1];
          } 
        return res;
    }
    public void solve(int i,int[]n,int k,ArrayList l,int s){
        if(i>=n.length)return;
        if(k==l.size()){if(s>m)ans=l;
                return;}
        ArrayList<Integer> t=new ArrayList<>(l);
        t.add(n[i]);
        solve(i+1,n,k,t,s+n[i]);
        solve(i+1,n,k,l,s);
    }
    
    
    // int l=0,i=0,j=0,s=nums[0],m=0;
    //     while(j<nums.length){
    //         if(j-i+1<k){
    //             j++;
    //         }
    //         else if(j-i+1==k){if(s>m){m=s;l=i;}
    //                           s-=nums[i];i++;j++;}
    //        if(j<nums.length)  s+=nums[j];
    //     }
    //     int[] res=new int[k];
    //     System.arraycopy(nums,l,res,0,k);
    //     return res;
}