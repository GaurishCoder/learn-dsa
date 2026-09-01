package LinkedList.SlowFastPointer;

public class MiddleNode {
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

    public static void findMiddleNode(Node head) {
        Node slow = head, fast = head;
        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle Node is:"+slow.data);
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


        displayList(head);
        findMiddleNode(head);

    }
}
