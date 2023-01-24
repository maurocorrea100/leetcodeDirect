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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        ListNode[] arr = new ListNode[k];
        if(k==1){
            arr[0] = head;
            return arr;
        }
        int rem = count%k;
        double part = Math.ceil((double) count/(double) k);
        double numBigPartitions =rem;
        ListNode curr = head;
        int index = 0;

        while(index<arr.length){
            int counter = 1;
            part = Math.ceil((double) count/(double) k);
            ListNode temp2 = curr;
            part = numBigPartitions > 0 ? part + 1 : part;
            if(rem==0) counter = 0;
            while(counter < part-1){
                temp2 = temp2.next;
                counter++;
            }
            numBigPartitions--;

            if(null!=temp2){
                ListNode temp3 = temp2.next;
                temp2.next = null;
                arr[index] = curr;
                index++;
                curr = temp3;
            }else{
                arr[index] = curr;
                index++;
                break;
            }

        }
        return arr;
    }
}