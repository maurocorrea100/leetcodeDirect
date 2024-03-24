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
    public ListNode detectCycle(ListNode head) {
        ListNode s = head, f = head;
        int i = 0;
        while(f != null){
            f = f.next;
            if(f==null) return null;
            f = f.next;
            s = s.next;
            if(f ==s){
                ListNode slow2 = head; 
                        while (slow2 != s){
                            s = s.next;
                            slow2 = slow2.next;
                        }
                        return s;
            }    
                
        }
        return null;
    }
}