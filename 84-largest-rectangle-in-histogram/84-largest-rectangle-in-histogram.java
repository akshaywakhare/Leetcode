class Solution {
    public int largestRectangleArea(int[] heights) {
        int m=0;
        Stack<Integer> st=new Stack<>();
        int[] nll=new int[heights.length];
        int[] nlr=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            while(!st.isEmpty()&&heights[st.peek()]>=heights[i]){st.pop();}
            if(st.isEmpty())nll[i]=-1;
             else nll[i]=st.peek();   
            st.push(i);    
        }st=new Stack<>();
        for(int i=heights.length-1;i>=0;i--){
            while(!st.isEmpty()&&heights[st.peek()]>=heights[i]){st.pop();}
            if(st.isEmpty())nlr[i]=heights.length;
             else nlr[i]=st.peek();   
            st.push(i);    
        }
        
        // System.out.println(nll);
        //     System.out.println(nlr);
        for(int i=0;i<heights.length;i++){
            m=Math.max(m,heights[i]*(nlr[i]-nll[i]-1));
        }
        return m;
    }
}