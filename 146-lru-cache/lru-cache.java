public class ListNode {
      int key, val;
      ListNode next;
      ListNode prev;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int key,int val){ this.val = val; this.key = key;}
      ListNode(int key,int val, ListNode next ,ListNode prev){
         this.key = key;
         this.val = val; 
         this.next = next; 
         this.prev = prev; 
    }
}
class LRUCache {
    int capacity;
    HashMap<Integer, ListNode> map= new HashMap<>();
    ListNode head = new ListNode();
    ListNode tail = new ListNode();
    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
       
    }
    
    public int  get(int key) {
        //if element in hash map return val
        if(map.containsKey(key)){
            ListNode node = map.get(key);
            delete(node);
            add(node);
            return node.val;
        }
        //else return -1
        else return -1;
    }
    public void add(ListNode node){
        node.next = head.next;
        node.prev =head;
        head.next.prev = node;
        head.next=node;

    }
    public void delete(ListNode node){
        
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    
    public void put(int key, int value) {
        //if value is in hash map then delete(node) and add(newnode)
        if(map.containsKey(key)){
            ListNode node = map.get(key);
            node.val = value;
            delete(node);
            add(node);
        }
        //if map.size == capacity then earase from map delete(tail.prev)
        else{
            if(map.size()== capacity){
            ListNode node = tail.prev;
            delete(node);
            map.remove(node.key);

        }
        //create newnode with val = value
        ListNode newnode = new ListNode(key, value);
        //add(newnode)
        add(newnode);
        //add to hash map
        map.put(key,newnode);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */