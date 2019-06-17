package challenges.Tree;

public class BTree<T extends Comparable> {
    BTreeNode<T> root;

    public BTree() {}
    public BTree(T value) {
        this.root = new BTreeNode<>(value);
    }

    public boolean isEmpty() {
        return this.root == null ? true : false;
    }

    // traversal methods go here
}
