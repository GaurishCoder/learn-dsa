package LinkedList;

public class RemoveAllOccurrenesFromList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void displayList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node removeAll(Node head, int x) {

        // Remove matching nodes from the beginning
        while (head != null && head.data == x) {
            head = head.next;
        }

        Node prev = head;
        Node curr = head;

        while (curr != null) {

            if (curr.data == x) {
                prev.next = curr.next;
                curr = curr.next;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(4);
        Node f = new Node(2);
        Node g = new Node(5);

        head.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        displayList(head);
        int x = 2;
        removeAll(head, x);
        displayList(head);

    }
}
