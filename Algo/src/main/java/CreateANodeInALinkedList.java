class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    Node head;

    void printLinkedList() {
        Node curr = this.head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
public class CreateANodeInALinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node p1 = new Node(10);
        Node p2 = new Node(20);
        Node p3 = new Node(30);
        Node p4 = new Node(40);
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        list.head = p1;
        list.printLinkedList();
    }
}


