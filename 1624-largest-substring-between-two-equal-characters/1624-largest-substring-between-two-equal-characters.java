class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character,Integer> set=new HashMap<>();int max=-1;
        for(int i=0;i<s.length();i++){
            if(set.containsKey(s.charAt(i)))max=Math.max(max,i-1-set.get(s.charAt(i)));
            else set.put(s.charAt(i),i);
        }
        return max;
    }
}