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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode curr = head;
        ListNode front = null, tail = null, prev = null, temp = null;
        int pos = 1;
        
        if(left == right) return head;
        
        if(left != 1){
            while (pos <= right) {
            
             if (pos < left-1) {
                curr = curr.next;
            }
            
            else if (pos == left-1) {
                front = curr;
                curr = curr.next;
                tail = curr;
                front.next = null;
            }
            
            else if (pos < right) {
                temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
            
            else {
                temp = curr.next;
                curr.next = prev;
                front.next = curr;
                tail.next = temp;
            }
            
            pos++;
            
            }
        } else{
            front = curr;
            while(curr != null && pos <= right){
                temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
                pos++;
                if(curr != null && pos > right){
                    front.next = curr;
                }
            }
            
            head = prev;
            
        }
        
        
        
        return head;
    }
}