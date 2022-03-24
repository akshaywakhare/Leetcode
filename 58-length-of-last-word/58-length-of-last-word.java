class Solution {
    public int lengthOfLastWord(String s) {
        s.trim();
        // StringTokenizer  st=new StringTokenizer(s," ");
         String[] result = s.split("\\s");
        // String ss="";
        // while(st.hasMoreTokens()){ss=st.nextToken();}
    return result[result.length-1].length();}
}