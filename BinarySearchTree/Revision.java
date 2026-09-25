/**
 * Revision
 */
public class Revision {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else if (root.data < val) {
            root.right = insert(root.right, val);
        }

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

    public static boolean search(Node root, int key) {
        if (root.left == null && root.right == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }

    }

    public static Node delete(Node root, int val) {
        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else {

            // case 1: leaf node delete
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2: one child
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }

           // case 3: two child
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int values[] = { 8, 5, 1, 2, 10, 7, 4, 6, 3, 9 };
        Node root = null;

        // Create BST
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        // Display BST
        inorder(root);

        // Search key
        boolean result = search(root, 4);
        if (result) {
            System.out.println("\nkey found");
        } else {
            System.out.println("\nkey not found");
        }

        // Delete Node in BST
        delete(root, 8);
        inorder(root);

    }

}