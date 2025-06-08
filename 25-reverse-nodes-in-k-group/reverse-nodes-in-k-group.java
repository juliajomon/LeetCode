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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp =head;
        int cnt =0;
        while(cnt< k){
            if(temp == null){
                return head;
            }
            temp = temp.next;
            cnt++;
        }
        ListNode pre = reverseKGroup(temp,k);

        
        ListNode tem =head;
        cnt = 0;
        while(cnt < k){
            ListNode next = tem.next;
            tem.next = pre;
            pre = tem;
            tem = next;

            cnt++;
        }return pre;
    }
}