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
//            double part = Math.round(((double) count/ (double) k)*100.0)/100.0;
            double part = Math.ceil((double) count/(double) k);
            System.out.println(part);
            System.out.println(rem);
            int numberOfNonPart = k - rem;
            int numberOfPart = k - numberOfNonPart;
            ListNode curr = head;
            int index = 0;

            while (numberOfPart>0){
                int counter = 1;
                ListNode temp2 = curr;
                while(counter < part){
                    temp2 = temp2.next;
                    counter++;
                }    
                
                ListNode temp3 = temp2.next;
                temp2.next = null;
                arr[index] = curr;
                index++;
                curr = temp3;
                numberOfPart--;
            }
            
            while(index<arr.length){
                int counter = 1;
                if(rem == 0) counter = 0;
                ListNode temp2 = curr;
                while(counter < part-1){
                    temp2 = temp2.next;
                    counter++;
                }

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