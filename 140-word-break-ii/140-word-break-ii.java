class Solution {
    Set<String> st;
    List<String>ans;
        public List<String> wordBreak(String s, List<String> wordDict) {
        st=new HashSet<>();
        for(String i:wordDict){
            st.add(i);
            
        }   
        ans=new ArrayList<>();                    
        helper(s,0,""); 
            return ans;
    }
    public void helper(String s,int i,String a){
    if(i==s.length()){
    ans.add(a.substring(1,a.length()));return;}
    
    for(int j=i;j<s.length();j++){
        if(st.contains(s.substring(i,j+1)))helper(s,j+1,a+" "+s.substring(i,j+1));
    }
    
    }
}