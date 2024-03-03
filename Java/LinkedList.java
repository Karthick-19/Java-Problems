package Java;

public class LinkedList {
    public static class Node{
        int data;
        Node next;

        Node(int val){
            this.data = val;
        }
    }
    // When you declare a nested class as static,
    // it can be instantiated without requiring an instance of the enclosing class.
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        Node head = n1;
        head = addFirst(head, 70);
        head = addLast(head, 90);
        head = addAt(head, 69, 3);
        head = removeFirst(head);
        head = removeLast(head);

        Node temp = head;
        while(temp != null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
    }
    public static Node addFirst(Node head,int val){
        Node n = new Node(val);
        n.next = head;//Here we are assigning the head as the node for n using n.next as we use next to represent Node
        head = n;
        return head;
    }
    public static Node addLast(Node head,int val){
        Node n = new Node(val);
        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        tail.next = n;
        return head;
    }
    public static Node addAt(Node head, int val, int k) {
        if (head == null || k == 0) {
            return addFirst(head, val); // Update head if necessary
        }
    
        Node n = new Node(val);
        Node temp = head;
        for (int i = 0; i < k - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            return head; // k is out of bounds, return unchanged list
        }
        n.next = temp.next; // Insert node n after temp
        temp.next = n;
    
        return head;
    }
    public static Node removeFirst(Node head){
        if(head == null) return null;
        head = head.next;
        return head;
    }
    public static Node removeLast(Node head){
        if(head == null) return null;//in case there is no node present empty ll
        if(head.next == null) return null;//in case there is only one node
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
}
