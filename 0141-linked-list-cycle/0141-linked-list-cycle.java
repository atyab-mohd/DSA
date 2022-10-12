/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode tom=head, jerry=head;
        while(jerry != null && jerry.next != null){
            tom=tom.next; //moving forward by 1 step
            jerry=jerry.next.next; //moving forward by 2 steps
            if(jerry==tom)
                return true;
        }
        return false;
    }
}