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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy= new ListNode();
        ListNode temp= dummy;
        int carry=0;
        while(l1 != null || l2 != null || carry != 0){
            int sum=0;
            if(l1 != null){
                sum+=l1.val;
                l1= l1.next;
            }
            if(l2 != null){
                sum+=l2.val;
                l2=l2.next;
            }
            sum+=carry;
            carry=sum/10;
            ListNode node= new ListNode(sum%10);
            temp.next= node;
            temp=temp.next;
        }
        return dummy.next;
    }
}
//WORST TIME COMPLEXITY IS:- O(max(n1,n2)) [it's either be n1 or n2 the reason is we have to traverse completely through the linked list having more no. of nodes]