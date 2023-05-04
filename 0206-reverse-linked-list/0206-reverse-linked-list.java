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
//         ListNode p = null;
//         ListNode t;
//         while (head != null) {
//             t = head.next;
//             head.next = p;
//             p = head;
//             head = t;
//         }
        
//         return p;
        
        return recursive(head, null);
    }
    
    public ListNode recursive(ListNode curr, ListNode prev) {
        if (curr == null) {
            return prev;
        }
        
        ListNode t = curr.next;
        curr.next = prev;
        prev = curr;
        
        return recursive(t, prev);
    }
}