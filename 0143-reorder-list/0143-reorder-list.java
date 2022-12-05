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
    //    System.out.println("Slow value: " + slow.val);

        Stack<ListNode> st = new Stack<>();

        ListNode temp = slow;
        slow = slow.next;
        temp.next = null;

        while(slow != null){
            ListNode s = slow;
            s = slow.next;
            slow.next = null;
            st.add(slow);
            slow = s;
        }

        ListNode node = head;
        ListNode tempNode = head;
        while(!st.isEmpty()){
            node = node.next;
            tempNode.next = st.pop();
            tempNode = tempNode.next;
            tempNode.next = node;
            tempNode = node;
        }

    }
}