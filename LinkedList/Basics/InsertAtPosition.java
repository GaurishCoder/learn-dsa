package LinkedList.Basics;

public class InsertAtPosition {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void insertAtPosition(Node head, int val, int position) {
        Node temp = head;
        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }
        Node newNode =  new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
        
    }

    public static void displayList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        head.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        insertAtPosition(head,25, 2);
        displayList(head);
    }
}
