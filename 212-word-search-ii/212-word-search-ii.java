class Solution {
    class TrieNode{
    TrieNode[] child;
    boolean end;
    TrieNode(){
        child=new TrieNode[26];
        end=false;
    }
    }
    TrieNode root;
    boolean[][] vis; 
    public void in(String s){
        TrieNode curr=root;
        for(int i=0;i<s.length();i++){
            int ind=s.charAt(i)-'a';
            if(curr.child[ind]==null)curr.child[ind]=new TrieNode();
            curr=curr.child[ind];
        }
        curr.end=true;
    } 
    List<String> ans;
    public List<String> findWords(char[][] board, String[] words) {
        root=new TrieNode();
        ans=new ArrayList<>();
        
        vis=new boolean[board.length][board[0].length];
        for(String s:words){in(s);}
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(root.child[board[i][j]-'a']!=null)helper(i,j,board,root.child[board[i][j]-'a'],""+board[i][j]);
            }
        }
        
        return ans;
    }
    int[] X={1,-1,0,0};
    int[] Y={0,0,-1,1};
    boolean valid(int a,int b,char[][] g,TrieNode c){
        if(a<0||b<0||a>=g.length||b>=g[0].length||vis[a][b]||c.child[g[a][b]-'a']==null)return false;
        return true;
    }
    void helper(int a,int b,char[][] board, TrieNode curr,String s){
        if(curr.end&&!ans.contains(s)){ans.add(s);}
        vis[a][b]=true;
        for(int i=0;i<4;i++)
        {
            if(valid(a+X[i],b+Y[i],board,curr))helper(a+X[i],b+Y[i],board,curr.child[board[a+X[i]][b+Y[i]]-'a'],s+board[a+X[i]][b+Y[i]]);
            
        }
        vis[a][b]=false;
    }
}