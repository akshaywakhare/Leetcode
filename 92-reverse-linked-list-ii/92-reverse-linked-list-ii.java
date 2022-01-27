/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null||head.next==null||left==right)return head;
        int i=1;
        ListNode temp=head;
        while(i<left-1){
            temp=temp.next; i++;
        }
         ListNode prev; ListNode start;
       if(left!=1){prev=temp;start=temp.next;}
       else{ prev=null; start=temp;}
       // if(prev!=null)
          //=temp.next;
        
        while(i <right){
            temp=temp.next; i++;
        }
       if(prev!=null) prev.next=temp;
       else head=temp;
       // ListNode end=temp.next;
   //     start.next=temp.next;
       // reverse(start,right-left);
        int j=right-left;
        ListNode t=start.next;
        start.next=temp.next;
        while(j-->0&&t!=null){
            ListNode s=t.next;
          //  ListNode r=t.next;
            t.next=start;
            start=t;t=s;
        }
        
        return head;
            
    }
}