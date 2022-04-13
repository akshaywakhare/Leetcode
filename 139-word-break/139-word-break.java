class Solution {
    Map<String,Boolean> mp=new HashMap<String,Boolean>();
    public boolean wordBreak(String s, List<String> wordDict) {
        return helper(s,wordDict);
    }
    public boolean helper(String s, List<String> dict){
        if(s.length()==0)return true;
        if(dict.size()==0)return false;
        if(dict.contains(s))return true;
        if(mp.containsKey(s))return mp.get(s);
        boolean flag=false;
        for(int k=1;k<s.length();k++){
            boolean left=false;
            boolean right=false;
            if(mp.containsKey(s.substring(0,k)))left=mp.get(s.substring(0,k));
            else left=helper(s.substring(0,k),dict);
            
            if(left) {
                                        if(mp.containsKey(s.substring(k,s.length())))left=mp.get(s.substring(k,s.length()));
                else right=helper(s.substring(k,s.length()),dict);
                       }
            flag=left&&right;
            if(flag)break;
        }
        mp.put(s,flag);
        return flag;
    }
}