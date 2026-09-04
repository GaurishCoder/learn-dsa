package LinkedList;

public class CheckPalindromeList {
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

    public static boolean isPalindromeList(Node head) {
        Node slow = head;
        Node fast = head;

        // find middle node
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // for old length
        if (fast != null) {
            slow = slow.next;
        }

        // reverse the list after middle node
        Node prev = null;
        Node curr = slow;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // compare with starting-head vs ending-prev
        Node temp = head;
        while (temp != null && prev != null) {
            if (temp.data != prev.data) {
                return false;
            }
            temp = temp.next;
            prev = prev.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node a = new Node(2);
        Node b = new Node(2);
        Node c = new Node(1);
        // Node d = new Node(1);
        head.next = a;
        a.next = b;
        b.next = c;
        // c.next = d;

        displayList(head);
        if (isPalindromeList(head)) {
            System.out.println("List is Palindrome");
        } else {
            System.out.println("List is Not Palindrome");
        }

    }
}
