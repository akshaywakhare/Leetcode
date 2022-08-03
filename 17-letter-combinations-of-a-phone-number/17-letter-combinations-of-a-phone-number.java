class Solution {  List<String> mapping;
                 List<String> ans;
    public List<String> letterCombinations(String digits) {
         mapping=new ArrayList<>();
         ans=new ArrayList<>();
        if(digits.length()==0)return ans;
        mapping.add("abc");
        mapping.add("def");
        mapping.add("ghi");
        mapping.add("jkl");
        mapping.add("mno");
        mapping.add("pqrs"); 
        mapping.add("tuv");
        mapping.add("wxyz");
    map(0,digits,"");
        return ans;
    }
                public void map(int i,String d,String a){
                    
                    if(i==d.length()){ans.add(a);return;}
                    for(int j=0;j<mapping.get(Integer.parseInt(d.substring(i,i+1))-2).length();j++){
                        map(i+1,d,a+mapping.get(Integer.parseInt(d.substring(i,i+1))-2).charAt(j));
                    }
                    
                }
}