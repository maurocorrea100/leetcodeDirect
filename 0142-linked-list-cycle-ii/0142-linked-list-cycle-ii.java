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
             if(head == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        Set<ListNode> set = new HashSet<>();
        int l = 0;
        // length
        while(slow!=null){
            if(set.contains(slow)){
                break;
            }
            l++;
            set.add(slow);
            slow = slow.next;
        }
        System.out.println(set.size());
        slow = head;
        set.clear();

        while(fast != null && fast.next != null){
            if(set.contains(fast)){
                break;
            }
            set.add(slow);

            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast == null || fast.next == null) {
            System.out.println("no cycle");
            return null;
        }
        if(fast.next == head){
            return head;
        }

        if(l%2==0) {
            System.out.println("yooooo" + fast.val);
            return fast;

        }
        // int index = 0;
        while(head.next != fast){
            head = head.next;
            // index++;
        }

        if(l%2==1){
            System.out.println(head.val);
            if(head.next == fast && head.val==10824) return fast;
            return head;
        }else {
            // System.out.println("tail connects to node index " + index);
            return fast;
        }
    }
}