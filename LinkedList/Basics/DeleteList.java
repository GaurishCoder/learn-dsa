package LinkedList.Basics;

public class DeleteList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node deleteAtFirst(Node head) {
        if (head == null) {
            return null;
        }
        head = head.next;
        return head;
    }

    public static void deleteAtEnd(Node head) {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        displayList(head);
    }

    public static void deleteAtPosition(Node head, int position) {
        Node temp = head;
        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
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

        deleteAtPosition(head,2);
        displayList(head);
    }
}
