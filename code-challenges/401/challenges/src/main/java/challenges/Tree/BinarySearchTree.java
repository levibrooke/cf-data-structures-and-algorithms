package challenges.Tree;

public class BinarySearchTree<T extends Comparable> extends BinaryTree<T> {

    public BinarySearchTree() {
        super();
    }

    public void add(T value) {
        this.root = add(value, this.root);
    }

    public BinaryTreeNode add(T value, BinaryTreeNode node) {
        if (node == null) {
            node = new BinaryTreeNode(value);
        }

        return node;
    }
}
