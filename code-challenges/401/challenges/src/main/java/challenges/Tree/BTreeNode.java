package challenges.Tree;

public class BTreeNode<T extends Comparable> {
    private T value;
    private BTreeNode<T> left;
    private BTreeNode<T> right;

    public BTreeNode() {}
    public BTreeNode(T value) {
        this.value = value;
    }
}
