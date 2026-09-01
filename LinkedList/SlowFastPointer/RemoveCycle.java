package LinkedList.SlowFastPointer;

public class RemoveCycle {
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

    public static void removeCycle(Node head) {
        Node slow = head,fast = head;
        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            // detect the cycle
            if (slow==fast) {

                slow = head;

                // cycle at head position (slow==fast)
                if (slow==fast) {
                    while (fast.next!=slow) {
                        fast = fast.next;
                    }
                    fast.next = null;
                    return;
                }

                // cycle at any other position
                Node previous = null;
                while (slow!=fast) {
                    previous = fast;
                    slow = slow.next;
                    fast = fast.next;
                }
                previous.next = null;
            }
        }
        displayList(head);
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        // Node e = new Node(5);

        head.next = b;
        b.next = c;
        c.next = d;
        d.next = c;
       
       removeCycle(head);
    }
}
