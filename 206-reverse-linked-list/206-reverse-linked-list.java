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
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode t=head;
        ListNode r=t.next;
        while(r!=null){
            ListNode s=r.next;
            r.next=t;
            t=r;r=s;
        }
        head.next=null;return t;
    }
}