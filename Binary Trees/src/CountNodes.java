public class CountNodes {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) { val = x; }
    }

    public int countNodes(TreeNode root) {
        return (root == null) ? 0 : 1 + countNodes(root.left) + countNodes(root.right);
    }

    public static void main(String[] args) {
        CountNodes tree = new CountNodes();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        System.out.println("Total number of nodes: " + tree.countNodes(root));
    }
}
