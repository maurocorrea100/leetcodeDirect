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
    Stack<ListNode> s1 = new Stack<>();
        Stack<ListNode> s2 = new Stack<>();
        
        ListNode temp = l1;
        fillStack(s1, temp);

        temp = l2;
        fillStack(s2,temp);
        
        int carry = 0, sum = 0;
        Stack<ListNode> longSt = s1.size() >= s2.size() ? s1 : s2;
        Stack<ListNode> shortSt = s1.size() < s2.size() ? s1 : s2;
        
        ListNode head = null;
        ListNode s = null;
        while(!shortSt.isEmpty()){
            head = longSt.pop();
            s = shortSt.pop();
            sum = head.val + s.val + carry;
            carry = sum > 9 ? 1 : 0;
            head.val = sum%10;
        }
        
        while (!longSt.isEmpty()){
            head = longSt.pop();
            sum = head.val + carry;
            carry = sum > 9 ? 1 : 0;
            head.val = sum%10;
        }
        
        if(carry == 1){
            temp = new ListNode(1);
            temp.next = head;
            head = temp;
        }
        return head;
    }

    private static void fillStack(Stack<ListNode> s1, ListNode temp) {
        while(temp != null){
            s1.push(temp);
            temp = temp.next;
        }
    }
}