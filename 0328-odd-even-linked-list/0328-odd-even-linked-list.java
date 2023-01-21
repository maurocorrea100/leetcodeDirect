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
    public ListNode oddEvenList(ListNode head) {
     
        if(head == null) return head;

        ListNode node = head;
        int c = 1;
        ListNode odd = null;
        ListNode even = null, evenHead = null;

        while(node != null){
            if(c%2==1){
                if(odd == null) odd = node;
                else {
                    odd.next = node;
                    odd = node;
                }
            }else{
                if(even == null){
                    even = node;
                    evenHead = node;
                }else {
                    even.next = node;
                    even = node;
                    if(evenHead.next == null) evenHead.next = node;
                }
            }
            c++;
            ListNode temp = node.next;
            node.next = null;
            node = temp;
        }

        odd.next = evenHead;
        return head;
    }
}