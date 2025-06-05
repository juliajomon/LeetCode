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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p1 = head;
        ListNode p2 = head;
        int len =1;
        if(head.next == null){
            head = null;
            return head;
        }
        while(p1.next != null){
            p1=p1.next;
            len++;
        }
        ;
        
        len = len - n;
        int len2 = 1;
        if(len == 0){
            head = head.next;
            return head;
        }
        while(len2!= len && p2!= null){
            p2 = p2.next;
            len2++;
        }
        
        p2.next= p2.next.next;
        
        return head;


    }
}