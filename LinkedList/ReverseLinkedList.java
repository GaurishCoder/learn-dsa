package LinkedList;

public class ReverseLinkedList {
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

    public static Node reverse(Node head) {
      Node prev = null;
      Node current = head;
      while (current!=null) {
        Node next = current.next;
        current.next = prev;
        prev = current;
        current = next;
      }
      return prev;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        head.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(b);
        displayList(head);
        head = reverse(head);
        displayList(head);

    }
}
