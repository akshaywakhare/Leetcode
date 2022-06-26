class Solution {
    public int longestPalindrome(String s) {
        int[] a=new int[60];
        int c=0;
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'A']++;
            if( a[s.charAt(i)-'A']==2){c+=2; a[s.charAt(i)-'A']=0;}
        }
      
        // for(int i:a){
        //     c+=i%2;
        // }
        if(c<s.length())c++;
        // else c*=2;
    return c;}
}