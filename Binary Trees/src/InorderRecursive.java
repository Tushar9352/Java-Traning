class Node {
    int item;
    Node left, right;

    public Node(int key) {
        item = key;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    void inorderTraversal(Node node) {
        if (node == null) {
            return;
        }

        // Traverse the left subtree
        inorderTraversal(node.left);

        // Visit the root node
        System.out.print(node.item + " ");

        // Traverse the right subtree
        inorderTraversal(node.right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(4);
        tree.root.right = new Node(3);
        tree.root.left.right = new Node(5);

        System.out.println("Inorder traversal of binary tree:");
        tree.inorderTraversal(tree.root);
    }
}
