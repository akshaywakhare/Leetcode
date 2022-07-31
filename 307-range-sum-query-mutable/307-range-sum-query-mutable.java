class NumArray {
int[] arr;
    long[] seg;
    public NumArray(int[] nums) {
        arr=nums;
        seg=new long[ nums.length*4];
        build(0,0,nums.length-1);
        
    }
    public void build(int ind,int left,int right){
        if(left==right){
            long a=arr[left];
            seg[ind]=a;
            return;
        }
        
        int m=(left+right)/2;
        build(2*ind+1,left,m);
        build(2*ind+2,m+1,right);
        seg[ind]=seg[2*ind+2]+seg[2*ind+1];
    }
    
    public void update(int index, int val) {
        arr[index]=val;
        update(0,index,val,0,arr.length-1);
    }
        public void update(int ind,int id, int val,int left,int right){
            if(id<left||id>right)return;
            
          if(left==right&&right==id){
             
            seg[ind]=val;
        return;}
        
        int m=(left+right)/2;
            
        if(m>=id)update(2*ind+1,id,val,left,m);
        else update(2*ind+2,id,val,m+1,right);
            
        seg[ind]=seg[2*ind+2]+seg[2*ind+1];
    }
    
    public int sumRange(int left, int right) {
            return sum(0,0,arr.length-1,left,right);     
    }
    public int sum(int ind,int left,int right,int l,int r){
        if(l>right||r<left)return 0;
        
        if(l<=left&&right<=r  )return (int)seg[ind];
        
        int m=left+(right-left)/2;
        
        return sum(2*ind+1,left,m,l,r )+sum(2*ind+2,m+1,right,l,r);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */