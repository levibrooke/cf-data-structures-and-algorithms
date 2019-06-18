package challenges.Tree;

public class BinaryTreeNode<T extends Comparable> {
    T value;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode() {}
    public BinaryTreeNode(T value) {
        this.value = value;
    }

    public void setLeft(BinaryTreeNode<T> left) {
        this.left = left;
    }

    public void setRight(BinaryTreeNode<T> right) {
        this.right = right;
    }
}
