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
        if(head.next==null) return ;
 ListNode fast = head;
        ListNode slow = head;
        ListNode mostLeft = null;
        while(fast.next != null){
            fast = fast.next;
            if(fast.next == null){
                break;
            }
            fast = fast.next;
            slow = slow.next;
        }
        
        ListNode curr = slow.next;
        slow.next = null;
        
        ListNode left = null;
        ListNode right = curr.next;
        while(curr !=null){
            curr.next = left;
            left = curr; 
            curr = right;
            if(curr == null) break;
            right = right.next;
        }
        
        ListNode f1 = head, f2 = head.next;
        ListNode s1 = left, s2 = left.next;
        
        while(f1 != null && s1 != null){
           f1.next = s1;
            s1.next = f2;
         f1 = f2;
         s1 = s2;
         if(f2 != null) f2 = f2.next;
         if(s2 != null) s2 = s2.next; 
        }
        
        
    }
}