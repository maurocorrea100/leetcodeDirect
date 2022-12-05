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
    public void reorderList(ListNode head) {
             ListNode slow = head, fast = head;
        while(fast != null && fast.next != null  ){
            slow = slow.next;
            fast = fast.next.next;
        }


//        System.out.println("Slow value: " + slow.val);

        ListNode temp = slow;
        slow = slow.next;
        temp.next = null;

        ListNode prev = null;
        //reverse linked list
        while(slow != null){
            ListNode node = slow;
            slow = slow.next;
            node.next = prev;
            prev = node;
        }

        ListNode head2 = prev;
        ListNode curr2 = head2;
        ListNode prev2 = head2;
        ListNode curr1 = head;
        ListNode prev1 = head;
        while(curr2 != null){
            curr1 = curr1.next;
            curr2 = curr2.next;
            prev2.next = null;
            prev1.next = prev2;
            prev2.next = curr1;
            prev1 = curr1;
            prev2 = curr2;
        }

    }
}