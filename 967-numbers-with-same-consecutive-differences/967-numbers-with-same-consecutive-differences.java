class Solution {
    List<Integer> ans;
    public int[] numsSameConsecDiff(int n, int k) {
     // if(n==1)if(k>30)return new int[]{};
        ans=new ArrayList<>();
        for(int i=1;i<=9;i++){
          func(n-1,k,i);
      }
        
         return ans.stream().mapToInt(i->i).toArray();
    }
    public void func(int n,int k,int s){
        if(n<=0){if(!ans.contains(s))ans.add(s);
                 return;
        }
        int prev=s%10;
        s*=10;
        int prev2=prev;
        if(prev+k<=9){prev+=k; 
                     
         func(n-1,k,s+prev); 
        }
        if(prev2-k>=0){prev2-=k; 
            func(n-1,k,s+prev2); }
        return;
    }
}