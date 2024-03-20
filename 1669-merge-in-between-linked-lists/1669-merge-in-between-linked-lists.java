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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
         ListNode curr = list1, leftNode = null;
         if(a==1) leftNode = curr;
        int l = 1;
        while(l < b+1){
            curr = curr.next;
            l++;
            if(l==a) leftNode = curr;
            
        }
        ListNode node = list2;
        while(node.next != null) node = node.next;
        leftNode.next=list2;
        node.next = curr.next;
        return list1;
    }
}