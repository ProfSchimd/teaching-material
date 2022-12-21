public class BinarySearchTree {
    public static class Node {
        public int value;
        public Node parent;
        public Node left;
        public Node right;
    }

    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    public BinarySearchTree(Node root) {
        this.root = root;
    }

    public Node search(int key) {
        return recursiveSearch(key, root);
    }

    private Node recursiveSearch(int key, Node node) {
        if (node == null || node.value == key) {
            return node;
        }
        if (key < node.value) {
            return recursiveSearch(key, node.left);
        } else {
            return recursiveSearch(key, node.right);
        }
    }

    public static void main(String[] args) {
        Node root = new Node();
        root.value = 53;
        root.left = new Node();
        root.left.value = 42;
        root.right = new Node();
        root.right.value = 56;
        root.left.left = new Node();
        root.left.left.value = 20;
        root.left.right = new Node();
        root.left.right.value = 48;
        root.right.left = new Node();
        root.right.left.value = 55;

        BinarySearchTree bst = new BinarySearchTree(root);
        
        System.out.println(bst.search(42) == null);
        System.out.println(bst.search(41) == null);
    }
}
