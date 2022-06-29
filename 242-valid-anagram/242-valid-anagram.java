class Solution {
    public boolean isAnagram(String s, String t) {
         int[] arr=new int[27];
        if(s.length()!=t.length())return false;
        for(int i=0;i<t.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        
        for(int i=0;i<t.length();i++){
            if(arr[t.charAt(i)-'a']==0)return false;
                    arr[t.charAt(i)-'a']--;
}
        
        return true;
    }
}