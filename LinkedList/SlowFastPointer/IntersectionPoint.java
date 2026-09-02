package LinkedList.SlowFastPointer;

public class IntersectionPoint {
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

    public static Node findIntersectionPoint(Node headA,Node headB) {
        Node p1 = headA;
        Node p2 = headB;

        while(p1!=p2){
            if (p1==null) {
                p1=headB;
            }else{
                p1=p1.next;
            }

            if (p2==null) {
                p2=headA;
            }else{
                p2=p2.next;
            }
        }
        return p1;
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
       
   
    }
}
