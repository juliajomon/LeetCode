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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i< lists.length;i++){
            ListNode temp = lists[i];
            while(temp != null){
                arr.add(temp.val);
                temp = temp.next;
            }
        }
        Collections.sort(arr);
        ListNode head = new ListNode(0);
        ListNode cur = head;
        
        for(int i = 0 ; i < arr.size() ; i++){
            cur.next = new ListNode(arr.get(i));
            cur = cur.next;
        }
        return head.next;
    }
}