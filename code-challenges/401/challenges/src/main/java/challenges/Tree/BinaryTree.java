package challenges.Tree;

import java.util.ArrayList;

public class BinaryTree<T extends Comparable> {
    BinaryTreeNode<T> root;

    public BinaryTree() {}
    public BinaryTree(T value) {
        this.root = new BinaryTreeNode<>(value);
    }

    public boolean isEmpty() {
        return this.root == null ? true : false;
    }

    // preOrder traversal
    public ArrayList preOrder() {
        ArrayList preOrderList = new ArrayList();

        this.preOrder(this.root, preOrderList);

        return preOrderList;
    }

    private void preOrder(BinaryTreeNode node, ArrayList preOrderList) {
        if (node == null) {
            return;
        }

        preOrderList.add(node.value);

        preOrder(node.left, preOrderList);

        preOrder(node.right, preOrderList);
    }

    // inOrder traversal
    public ArrayList inOrder() {
        ArrayList inOrderList = new ArrayList();

        this.inOrder(this.root, inOrderList);

        return inOrderList;
    }

    private void inOrder(BinaryTreeNode node, ArrayList inOrderList) {
        if (node == null) {
            return;
        }

        inOrder(node.left, inOrderList); // move to left first
        inOrderList.add(node.value);
        inOrder(node.right, inOrderList);
    }

    // postOrder traversal
    public ArrayList postOrder() {
        ArrayList postOrderList = new ArrayList();

        this.postOrder(this.root, postOrderList);

        return postOrderList;
    }

    private void postOrder(BinaryTreeNode node, ArrayList postOrderList) {
        if (node == null) {
            return;
        }

        postOrder(node.left, postOrderList); // move to left first
        postOrder(node.right, postOrderList); // then right
        postOrderList.add(node.value);
    }
}
