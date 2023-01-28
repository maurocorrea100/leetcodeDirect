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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int n1 = countNodes(l1), n2 = countNodes(l2);
        ListNode result = null;
        if(n1 > n2)
            result = addTwoNumbers(l1, n1, l2, n2);
        else
            result = addTwoNumbers(l2, n2, l1, n1);
        
        if(result != null && result.val > 9) {
            result.val = result.val % 10;
            return new ListNode(1, result);
        }
        return result;
    }
    
    int countNodes(ListNode node) {
        int count = 0;
        while(node != null) { count++; node = node.next; }
        return count;
    }
    
    public ListNode addTwoNumbers(ListNode l1, int n1, ListNode l2, int n2) {
        if(n1 > 0) {
            int val2 = 0;
            if(n1 == n2) {
                val2 = l2.val; l2 = l2.next; n2--;
            }
            ListNode result = addTwoNumbers(l1.next, n1 - 1, l2, n2);
            int c = 0;
            if(result != null && result.val > 9) {
                c = 1;
                result.val = result.val % 10;
            }
            return  new ListNode(l1.val + val2 + c, result);
        }
        return null;
    }
}