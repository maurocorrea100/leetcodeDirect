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
               ListNode resHead = null;
        ListNode curr = null;
        ListNode node = null;
        boolean hasExtra = false;
        boolean firstTime = true;
        boolean endRiched = false;
        int sum = 0;

        while(!endRiched){
            sum = 0;
            if(hasExtra) sum++;
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            sum = sum + val1 + val2;
            hasExtra = sum > 9;
            if(firstTime){
                sum = sum%10;
                curr = new ListNode(sum);
                resHead = curr;
                firstTime = false;
            }else{
                sum = sum%10;
                node = new ListNode(sum);
                curr.next = node;
                curr = node;
            }

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
            endRiched = l1 == null && l2 == null;
        }

        if(l1 == null && l2 == null && hasExtra) {
            node = new ListNode(1);
            curr.next = node;
            return resHead;
        }
        
        return resHead;
    }
}