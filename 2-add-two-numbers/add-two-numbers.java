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
        //list  named result
        ListNode result = new ListNode();
        //ptr to result
        ListNode ptr = result;
        //while l1 and l2 not equal to null 
        int sum =0;
        int carry =  0;
        
        while(l1!=null || l2 != null){
            //initialize sum = 0 +carry
            sum = 0+carry;
            //if l1 is not null then sum+= l1.val and increament l1
            //if l2 is not null then sum+= l2.val and increament l2
            if(l1!=null){
                sum += l1.val;
                l1= l1.next;
            }
            if(l2!=null){
                sum += l2.val;
                l2= l2.next;
            }
            
             carry = sum/10;
            sum = sum%10;
            //create new node foor sum
            ptr.next = new ListNode(sum);
            //increament ptr
            ptr = ptr.next;
            //if carry is 1 ptr.next as 1
            if(carry == 1) ptr.next = new ListNode(1);
        }
        return result.next;
    } 
}