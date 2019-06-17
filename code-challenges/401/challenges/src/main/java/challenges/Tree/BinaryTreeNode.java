package challenges.Tree;

public class BinaryTreeNode<T extends Comparable> {
    T value;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode() {}
    public BinaryTreeNode(T value) {
        this.value = value;
    }
}
