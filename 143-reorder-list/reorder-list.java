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
        if (head == null || head.next == null) return;

        /* 1. Find the middle (slow/fast) */
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        /* 2. Reverse the second half that starts AFTER `slow` */
        ListNode second = slow.next;
        slow.next = null;          // split the list
        ListNode prev = null;
        while (second != null) {
            ListNode next = second.next;
            second.next = prev;
            prev = second;
            second = next;
        }
        // `prev` is now the head of the reversed second half

        /* 3. Merge the two halves alternately */
        ListNode first = head;
        ListNode third;            // temp pointer for clarity

        while (prev != null) {     // prev walks the reversed half
            // stash the next nodes
            second = prev.next;
            third  = first.next;

            // weave one node from each half
            first.next = prev;
            prev.next  = third;

            // advance
            first = third;
            prev  = second;
        }
    }
}
