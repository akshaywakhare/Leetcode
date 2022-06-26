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
        ListNode t=head.next;head.next=null;
        while(t.next!=null){
            ListNode s=t.next;
            t.next=head;
            head=t;t=s;
        } t.next=head;return t;
    }
}