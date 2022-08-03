class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<2)return s.length();
        Set<Character> set=new HashSet<>();
        int i=0,j=0,nas=0;
        while(j<s.length()){
            if(!set.contains(s.charAt(j)))set.add(s.charAt(j));
            else{
                nas=Math.max(nas,j-i);
                while(s.charAt(i)!= s.charAt(j)){set.remove(s.charAt(i)); i++;} 
                // set.add(s.charAt(j));
                i++;
            }
                j++;
        }
        
          nas=Math.max(nas,j-i);
        return nas;
    }
}