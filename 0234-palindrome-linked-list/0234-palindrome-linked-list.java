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
    public boolean isPalindrome(ListNode head) {
          ListNode prev = null;
        var current = head;
        var fast = head;
        
        while (fast !=null && fast.next != null) {
            fast = fast.next.next;
            var temp = current;
            current = current.next;
            temp.next = prev;
            prev = temp;
            head = prev;
        }
        
        if(fast != null)
            current = current.next;
        
        while(current != null){
            if(head.val != current.val)
                return false;
            current = current . next;
            head = head.next;
        }
        
        return true;
    }
}