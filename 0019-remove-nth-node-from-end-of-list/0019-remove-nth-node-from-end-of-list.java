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
        
        if(head.next==null) return null;
        
        ListNode curr = head;
        // find size
        int size = 0;
        while(curr!=null){
            size++;
            curr=curr.next;
        }
        
        int ind = size - n - 1; // 2
        if(n==size) return head.next;
        
        curr = head;
        while(ind>0){
            curr = curr.next;
            ind--;
        }
        
        ListNode temp = curr.next.next;
        curr.next =temp;
        return head;
        
    }
}