/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if( head == null || head.next == null)
            return head;
        // else if( head.val == head.next.val)
        //         head.next = deleteDuplicates(head.next.next);
        // else
            head.next = deleteDuplicates(head.next);
    
        return (head.next != null)?((head.val == head.next.val)?head.next:head):head;
    }
}