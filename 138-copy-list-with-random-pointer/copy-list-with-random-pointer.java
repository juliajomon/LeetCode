/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }
        //create a duplicate inside the linked list
        Node curr = head;
        while (curr != null){
            Node newnode = new Node(curr.val);
            newnode.next = curr.next;
            curr.next = newnode;
            curr =newnode.next;
        }

        //assign random pointer to duplicates
        curr = head;
        while(curr != null){
            if(curr.random !=null){curr.next.random = curr.random.next;}
            curr = curr.next.next;
        }
        //split the linked list
        curr = head;
        Node newhead = head.next;
        Node newcurr = newhead;
        while(curr != null){
            curr.next = newcurr.next;
            curr = curr.next;
            if(curr != null){newcurr.next = curr.next;
            newcurr = newcurr.next;}
        }
        return newhead;
    }
}