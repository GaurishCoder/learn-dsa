
public class SearchKey {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node createdBST() {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);
        root.left.left.left = new Node(1);
        root.left.left.right = new Node(4);
        root.right.right.right = new Node(14);

        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean findKey(Node root, int key) { // TC:O(H) - in wrost case in key is present still leaf node  , H is height of tree 
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        } 
        
        if (root.data > key) {
            return findKey(root.left, key);
        } else {
            return findKey(root.right, key);
        }
    }

    /*
     * search key: 1. compare with root data
     * 2. if root data is greater then key , search in left side
     * 3. else search in right side
     */

    public static void main(String[] args) {
        Node root = createdBST();
        if (findKey(root, 100)) {
            System.out.println("Key is Present");
        }else{
            System.out.println("Key is Not Present");
        }

    }
}
