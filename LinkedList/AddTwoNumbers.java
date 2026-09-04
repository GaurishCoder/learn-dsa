package LinkedList;

public class AddTwoNumbers {
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

    public Node addTwoNumbers(Node l1, Node l2) {
        Node dummyHead = new Node(0);
        Node tail = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.data : 0;
            int digit2 = (l2 != null) ? l2.data : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            Node newNode = new Node(digit);
            tail.next = newNode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        Node result = dummyHead.next;
        dummyHead.next = null;
        return result;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(3);
        head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;

        displayList(head);

    }
}
