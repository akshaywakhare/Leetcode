/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {int sec=-35465051;
    public Node connect(Node root) {
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        Node nq=new Node(sec);
        q.offer(nq);
        while(true){
            Node n=q.poll();
            if(q.isEmpty())break;
            if(n!=null&&n.val==sec){q.offer(n);continue;}
           if(n!=null){ if(q.peek().val!=sec)n.next=q.peek();
                       else n.next=null;
            q.offer(n.left);
            q.offer(n.right);}
        }return root;
    }
}