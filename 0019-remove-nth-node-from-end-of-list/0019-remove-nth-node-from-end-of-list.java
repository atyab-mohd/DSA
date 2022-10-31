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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null) return null;
        ListNode curr= head;
        int total=0;
        while(curr!=null){
            total++;
            curr=curr.next;
        }
        n=total-n;
        if(n==0) return head.next;
        ListNode prev=null;
        ListNode pos=head;
        for(int i=0;i<n;i++){
            prev=pos;
            pos=pos.next;
        }
        prev.next=pos.next;
        return head;
    }
}