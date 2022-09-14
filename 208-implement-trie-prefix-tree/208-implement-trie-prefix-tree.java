class Trie {

    class TrieNode{
        TrieNode[] child;
        boolean end;
        TrieNode(){
            child=new TrieNode[26];
            end=false;
        }
    }
    TrieNode root;
    public Trie() {
        root=new TrieNode();
        
    }
    
    public void insert(String word) {
        TrieNode curr=root;
        for(int i=0;i<word.length();i++){
            int ind=word.charAt(i)-'a';
            if(curr.child[ind]==null)curr.child[ind]=new TrieNode();
            curr=curr.child[ind];
        }
        curr.end=true;
    }
    
    public boolean search(String word) {
          TrieNode curr=root;
         for(int i=0;i<word.length();i++){
            int ind=word.charAt(i)-'a';
            if(curr.child[ind]==null)return false;//cur.child[ind]=new TrieNode();
            curr=curr.child[ind];
        }
       return curr.end==true;
    }
    
    public boolean startsWith(String word) {
        TrieNode curr=root;
         for(int i=0;i<word.length();i++){
            int ind=word.charAt(i)-'a';
            if(curr.child[ind]==null)return false;//cur.child[ind]=new TrieNode();
            curr=curr.child[ind];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */