class Solution {
    public String longestCommonPrefix(String[] strs) {
        boolean f=false;
        String temp=strs[0];
        for(int i=1;i<strs.length;i++){
            int a=0;// 
            while(a<=temp.length()&&a<=strs[i].length()&&temp.substring(0,a).equals(strs[i].substring(0,a))){a++;}
            if(a>temp.length())continue;
            else if(a>strs[i].length())temp=strs[i];
            else temp=strs[i].substring(0,a-1);
        }
        // if(!f)return "";
        return temp;
    }
}