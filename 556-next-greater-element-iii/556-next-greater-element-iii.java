class Solution {
    public int nextGreaterElement(int n) {
        String s=Integer.toString(n);
        int i=s.length()-2;
        while(i>=0&&s.charAt(i)>=s.charAt(i+1)){i--;}
        if(i<0)return -1;
        int j=i;
           i=s.length()-1;
        while(i>j&&s.charAt(i)<=s.charAt(j)){i--;}
         
        char[] ch = s.toCharArray();
        char c=ch[i];
        ch[i]=ch[j];
        ch[j]=c;
        j++;i=ch.length-1;
        
        while(j<i){
            c=ch[i];
        ch[i]=ch[j];
        ch[j]=c;
           i--;j++;
        }
        
        double res=0;
        for(  i=0;i<ch.length;i++){
            res*=10;
            if(res>Integer.MAX_VALUE)return -1;
            res+=ch[i]-'0';
        }
       if(res>Integer.MAX_VALUE)return -1;
           
        return (int)res;
//         int l=Integer.parseInt(s.substring(i,s.length()))/10;
//         int f=0;
//         if(i>0)f=Integer.parseInt(s.substring(0,i));
        
//         f*=10;
//         f+=n%10;
//        f*=(int)Math.pow(10,s.length()-i-1);
        // return f+l;
        
    }
}
//124486